package com.expanse.Coino.service;

import com.expanse.Coino.repository.GroupRepository;
import com.expanse.Coino.models.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageGroupsService {

    @Autowired
    private GroupRepository groupRepository;

    public Group createGroup(Group group) {
        return groupRepository.save(group);
    }

    public Group findGroupById(String groupId) {
        return groupRepository.findById(groupId).orElse(null);
    }


    public Group updateGroupName(String groupId, String newGroupName, String userId) {
        return groupRepository.findById(groupId)
                .map(existingGroup -> {
                    existingGroup.setGroupName(newGroupName);
                    existingGroup.setUpdatedBy(userId);
//                    existingGroup.setMemberIds(updatedGroup.getMemberIds());
//                    existingGroup.setExpenseIds(updatedGroup.getExpenseIds());
                    return groupRepository.save(existingGroup);
                })
                .orElse(null);
    }

    public List<Group> findAllGroupsByUserId(String userId) {
        return groupRepository.findAllGroupsByUserId(userId);
    }
}
