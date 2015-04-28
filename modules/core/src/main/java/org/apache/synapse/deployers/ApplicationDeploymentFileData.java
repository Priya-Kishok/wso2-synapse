package org.apache.synapse.deployers;

import org.apache.axis2.AxisFault;
import org.apache.axis2.deployment.Deployer;
import org.apache.axis2.deployment.DeploymentException;
import org.apache.axis2.deployment.repository.util.DeploymentFileData;

import java.io.File;

public class ApplicationDeploymentFileData extends DeploymentFileData {

    private String parentFileName;

    public ApplicationDeploymentFileData(File file) {
        super(file);
    }

    public ApplicationDeploymentFileData(File file, Deployer deployer) {
        super(file,deployer);
    }

    public void setParentFileName(String fileName) {
        this.parentFileName = fileName;
    }

    public String getParentFileName() {
        return parentFileName;
    }

    public String getAbsolutePath() {
        return super.getAbsolutePath();
    }

    public ClassLoader getClassLoader() {
        return super.getClassLoader();
    }

    public File getFile() {
        return super.getFile();
    }

    /**
     * Get the name of the file.
     *
     * @return the name of the referenced file
     */
    public String getName() {
        return super.getName(); // No need to check for null due to constructor check
    }

    /**
     * Get the name of the file.
     *
     * @return the name of the referenced file
     * @deprecated please use getName() instead - this will disappear after 1.3.
     */
    public String getServiceName() {
        return super.getServiceName();
    }


    public void setClassLoader(ClassLoader classLoader) {
        super.setClassLoader(classLoader);
    }

    public void setClassLoader(boolean isDirectory, ClassLoader parent, File file, boolean isChildFirstClassLoading) throws AxisFault {
        super.setClassLoader(isDirectory,parent,file,isChildFirstClassLoading);
    }

    public Deployer getDeployer() {
        return super.getDeployer();
    }

    public void setDeployer(Deployer deployer) {
        super.setDeployer(deployer);
    }

    public void deploy() throws DeploymentException {
        super.deploy();
    }
}
