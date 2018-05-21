package com.redhat.victims.vlk.entity;

import java.util.List;
import java.util.Map;

/**
 * The main container for data structure used to store victims record
 * information.
 */
public class Artifact implements ArtifactInterface{

    private List<Artifact> embedded;
    private String fileType;
    private Map<String, String> fingerprint;
    private List<Artifact> content;
    private String filename;
    private Map<String , String> metadata;

    public Artifact() {
    }

    @Override
    public List<Artifact> getEmbedded() {
        return embedded;
    }

    public void setEmbedded(List<Artifact> embedded) {
        this.embedded = embedded;
    }

    @Override
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public Map<String, String> getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(Map<String, String> fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public List<Artifact> getContent() {
        return content;
    }

    public void setContent(List<Artifact> content) {
        this.content = content;
    }

    @Override
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artifact artifact = (Artifact) o;

        if (getEmbedded() != null ? !getEmbedded().equals(artifact.getEmbedded()) : artifact.getEmbedded() != null)
            return false;
        if (getFileType() != null ? !getFileType().equals(artifact.getFileType()) : artifact.getFileType() != null)
            return false;
        if (getFingerprint() != null ? !getFingerprint().equals(artifact.getFingerprint()) : artifact.getFingerprint() != null)
            return false;
        if (getContent() != null ? !getContent().equals(artifact.getContent()) : artifact.getContent() != null)
            return false;
        if (getFilename() != null ? !getFilename().equals(artifact.getFilename()) : artifact.getFilename() != null)
            return false;
        return getMetadata() != null ? getMetadata().equals(artifact.getMetadata()) : artifact.getMetadata() == null;
    }

    @Override
    public int hashCode() {
        int result = getEmbedded() != null ? getEmbedded().hashCode() : 0;
        result = 31 * result + (getFileType() != null ? getFileType().hashCode() : 0);
        result = 31 * result + (getFingerprint() != null ? getFingerprint().hashCode() : 0);
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        result = 31 * result + (getFilename() != null ? getFilename().hashCode() : 0);
        result = 31 * result + (getMetadata() != null ? getMetadata().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Artifact{" +
            "embedded=" + embedded +
            ", fileType='" + fileType + '\'' +
            ", fingerprint=" + fingerprint +
            ", content=" + content +
            ", filename='" + filename + '\'' +
            ", metadata=" + metadata +
            '}';
    }
}
