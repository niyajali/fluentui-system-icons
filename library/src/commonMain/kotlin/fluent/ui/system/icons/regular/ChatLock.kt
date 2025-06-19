package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.ChatLock: ImageVector
    get() {
        if (_ChatLock != null) {
            return _ChatLock!!
        }
        _ChatLock = ImageVector.Builder(
            name = "Regular.ChatLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 13.62f, 2.386f, 15.186f, 3.115f, 16.592f)
                lineTo(2.047f, 20.415f)
                curveTo(1.985f, 20.635f, 1.985f, 20.868f, 2.047f, 21.088f)
                curveTo(2.233f, 21.753f, 2.922f, 22.141f, 3.587f, 21.955f)
                lineTo(7.413f, 20.888f)
                curveTo(8.818f, 21.615f, 10.382f, 22f, 12f, 22f)
                curveTo(12.351f, 22f, 12.698f, 21.982f, 13.04f, 21.947f)
                curveTo(13.014f, 21.802f, 13f, 21.652f, 13f, 21.5f)
                verticalLineTo(20.442f)
                curveTo(12.672f, 20.48f, 12.338f, 20.5f, 12f, 20.5f)
                curveTo(10.532f, 20.5f, 9.12f, 20.128f, 7.867f, 19.43f)
                lineTo(7.598f, 19.279f)
                lineTo(3.611f, 20.391f)
                lineTo(4.724f, 16.407f)
                lineTo(4.573f, 16.138f)
                curveTo(3.873f, 14.883f, 3.5f, 13.47f, 3.5f, 12f)
                curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
                curveTo(16.389f, 3.5f, 20f, 6.826f, 20.452f, 11.095f)
                curveTo(21.19f, 11.591f, 21.728f, 12.361f, 21.921f, 13.259f)
                curveTo(21.973f, 12.847f, 22f, 12.427f, 22f, 12f)
                close()
                moveTo(16f, 15f)
                horizontalLineTo(15.5f)
                curveTo(14.672f, 15f, 14f, 15.672f, 14f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(14f, 22.328f, 14.672f, 23f, 15.5f, 23f)
                horizontalLineTo(21.5f)
                curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(23f, 15.672f, 22.328f, 15f, 21.5f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                curveTo(21f, 12.619f, 19.881f, 11.5f, 18.5f, 11.5f)
                curveTo(17.119f, 11.5f, 16f, 12.619f, 16f, 14f)
                verticalLineTo(15f)
                close()
                moveTo(17.5f, 14f)
                curveTo(17.5f, 13.448f, 17.948f, 13f, 18.5f, 13f)
                curveTo(19.052f, 13f, 19.5f, 13.448f, 19.5f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(17.5f)
                verticalLineTo(14f)
                close()
                moveTo(19.5f, 19f)
                curveTo(19.5f, 19.552f, 19.052f, 20f, 18.5f, 20f)
                curveTo(17.948f, 20f, 17.5f, 19.552f, 17.5f, 19f)
                curveTo(17.5f, 18.448f, 17.948f, 18f, 18.5f, 18f)
                curveTo(19.052f, 18f, 19.5f, 18.448f, 19.5f, 19f)
                close()
            }
        }.build()

        return _ChatLock!!
    }

@Suppress("ObjectPropertyName")
private var _ChatLock: ImageVector? = null

@Preview
@Composable
private fun ChatLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChatLock, contentDescription = null)
    }
}
