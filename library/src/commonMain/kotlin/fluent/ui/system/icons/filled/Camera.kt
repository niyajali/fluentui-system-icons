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

public val FluentIcons.Filled.Camera: ImageVector
    get() {
        if (_Camera != null) {
            return _Camera!!
        }
        _Camera = ImageVector.Builder(
            name = "Filled.Camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.925f, 2.504f)
                curveTo(14.722f, 2.504f, 15.461f, 2.926f, 15.865f, 3.614f)
                lineTo(16.679f, 5.001f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 5.001f, 22f, 6.456f, 22f, 8.251f)
                verticalLineTo(17.751f)
                curveTo(22f, 19.546f, 20.545f, 21.001f, 18.75f, 21.001f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 21.001f, 2f, 19.546f, 2f, 17.751f)
                verticalLineTo(8.251f)
                curveTo(2f, 6.456f, 3.455f, 5.001f, 5.25f, 5.001f)
                horizontalLineTo(7.33f)
                lineTo(8.205f, 3.577f)
                curveTo(8.614f, 2.91f, 9.34f, 2.504f, 10.122f, 2.504f)
                horizontalLineTo(13.925f)
                close()
                moveTo(12f, 8.001f)
                curveTo(9.515f, 8.001f, 7.5f, 10.016f, 7.5f, 12.501f)
                curveTo(7.5f, 14.986f, 9.515f, 17.001f, 12f, 17.001f)
                curveTo(14.485f, 17.001f, 16.5f, 14.986f, 16.5f, 12.501f)
                curveTo(16.5f, 10.016f, 14.485f, 8.001f, 12f, 8.001f)
                close()
                moveTo(12f, 9.501f)
                curveTo(13.657f, 9.501f, 15f, 10.844f, 15f, 12.501f)
                curveTo(15f, 14.158f, 13.657f, 15.501f, 12f, 15.501f)
                curveTo(10.343f, 15.501f, 9f, 14.158f, 9f, 12.501f)
                curveTo(9f, 10.844f, 10.343f, 9.501f, 12f, 9.501f)
                close()
            }
        }.build()

        return _Camera!!
    }

@Suppress("ObjectPropertyName")
private var _Camera: ImageVector? = null

@Preview
@Composable
private fun CameraPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Camera, contentDescription = null)
    }
}
