package com.expanse.Coino.controller;

import com.expanse.Coino.models.Group;
import com.expanse.Coino.service.ManageGroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private ManageGroupsService manageGroupsService;

    // Example method utilizing ManageGroupService
    @PostMapping("/create")
    public ResponseEntity<Group> createGroup(@RequestBody Group group) {
        return ResponseEntity.ok(manageGroupsService.createGroup(group));
    }

    @PutMapping("/update-group-name/{groupId}")
    public ResponseEntity<Group> updateGroupName(@PathVariable String groupId, @RequestParam String newName, @RequestParam String userId) {
        return ResponseEntity.ok(manageGroupsService.updateGroupName(groupId, newName, userId));
    }

    @GetMapping("/find-group/{groupId}")
    public ResponseEntity<Group> getGroupDetails(@PathVariable String groupId) {
        return ResponseEntity.ok(manageGroupsService.findGroupById(groupId));
    }

    @GetMapping("/find-groups")
    public ResponseEntity<List<Group>> getAllGroupsByUser(@RequestParam String memberId) {
        return ResponseEntity.ok(manageGroupsService.findAllGroupsByUserId(memberId));
    }

}
