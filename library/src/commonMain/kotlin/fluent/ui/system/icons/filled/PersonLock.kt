package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.PersonLock: ImageVector
    get() {
        if (_PersonLock != null) {
            return _PersonLock!!
        }
        _PersonLock = ImageVector.Builder(
            name = "Filled.PersonLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14f, 14.05f)
                verticalLineTo(14f)
                horizontalLineTo(4.253f)
                curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(2.004f, 17.741f, 2.182f, 18.299f, 2.514f, 18.765f)
                curveTo(4.056f, 20.929f, 6.579f, 22.001f, 10f, 22.001f)
                curveTo(10.715f, 22.001f, 11.39f, 21.955f, 12.026f, 21.861f)
                curveTo(12.009f, 21.743f, 12f, 21.622f, 12f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(12f, 15.29f, 12.859f, 14.282f, 14f, 14.05f)
                close()
                moveTo(10f, 2.005f)
                curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
                curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
                curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
                curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
                close()
                moveTo(15f, 15f)
                verticalLineTo(14f)
                curveTo(15f, 12.619f, 16.119f, 11.5f, 17.5f, 11.5f)
                curveTo(18.881f, 11.5f, 20f, 12.619f, 20f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(20.5f)
                curveTo(21.328f, 15f, 22f, 15.672f, 22f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(22f, 22.328f, 21.328f, 23f, 20.5f, 23f)
                horizontalLineTo(14.5f)
                curveTo(13.672f, 23f, 13f, 22.328f, 13f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(13f, 15.672f, 13.672f, 15f, 14.5f, 15f)
                horizontalLineTo(15f)
                close()
                moveTo(16.5f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(18.5f)
                verticalLineTo(14f)
                curveTo(18.5f, 13.448f, 18.052f, 13f, 17.5f, 13f)
                curveTo(16.948f, 13f, 16.5f, 13.448f, 16.5f, 14f)
                close()
                moveTo(18.5f, 19f)
                curveTo(18.5f, 18.448f, 18.052f, 18f, 17.5f, 18f)
                curveTo(16.948f, 18f, 16.5f, 18.448f, 16.5f, 19f)
                curveTo(16.5f, 19.552f, 16.948f, 20f, 17.5f, 20f)
                curveTo(18.052f, 20f, 18.5f, 19.552f, 18.5f, 19f)
                close()
            }
        }.build()

        return _PersonLock!!
    }

@Suppress("ObjectPropertyName")
private var _PersonLock: ImageVector? = null

@Preview
@Composable
private fun PersonLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonLock, contentDescription = null)
    }
}
