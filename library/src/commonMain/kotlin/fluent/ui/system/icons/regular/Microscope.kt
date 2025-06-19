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

public val FluentIcons.Regular.Microscope: ImageVector
    get() {
        if (_Microscope != null) {
            return _Microscope!!
        }
        _Microscope = ImageVector.Builder(
            name = "Regular.Microscope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 2.75f)
                curveTo(8f, 2.336f, 8.336f, 2f, 8.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 2f, 11f, 2.336f, 11f, 2.75f)
                verticalLineTo(3f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 3f, 13f, 3.336f, 13f, 3.75f)
                verticalLineTo(5.535f)
                curveTo(13.009f, 5.535f, 13.017f, 5.536f, 13.025f, 5.537f)
                curveTo(15.137f, 5.736f, 17.09f, 6.741f, 18.481f, 8.342f)
                curveTo(19.871f, 9.944f, 20.591f, 12.02f, 20.491f, 14.138f)
                curveTo(20.391f, 16.257f, 19.479f, 18.255f, 17.945f, 19.719f)
                curveTo(17.646f, 20.004f, 17.328f, 20.265f, 16.993f, 20.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 20.5f, 21f, 20.836f, 21f, 21.25f)
                curveTo(21f, 21.664f, 20.664f, 22f, 20.25f, 22f)
                horizontalLineTo(12.279f)
                curveTo(12.269f, 22f, 12.26f, 22f, 12.25f, 22f)
                curveTo(12.247f, 22f, 12.244f, 22f, 12.241f, 22f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 22f, 3f, 21.664f, 3f, 21.25f)
                curveTo(3f, 20.836f, 3.336f, 20.5f, 3.75f, 20.5f)
                horizontalLineTo(12.277f)
                curveTo(14.002f, 20.493f, 15.66f, 19.826f, 16.909f, 18.634f)
                curveTo(18.165f, 17.436f, 18.911f, 15.801f, 18.993f, 14.068f)
                curveTo(19.074f, 12.334f, 18.485f, 10.636f, 17.348f, 9.326f)
                curveTo(16.236f, 8.044f, 14.683f, 7.23f, 13f, 7.042f)
                verticalLineTo(12.25f)
                curveTo(13f, 12.664f, 12.664f, 13f, 12.25f, 13f)
                horizontalLineTo(11.5f)
                verticalLineTo(14f)
                curveTo(11.5f, 15.105f, 10.605f, 16f, 9.5f, 16f)
                curveTo(8.395f, 16f, 7.5f, 15.105f, 7.5f, 14f)
                verticalLineTo(13f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 13f, 6f, 12.664f, 6f, 12.25f)
                verticalLineTo(3.75f)
                curveTo(6f, 3.336f, 6.336f, 3f, 6.75f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(2.75f)
                close()
                moveTo(9f, 13f)
                verticalLineTo(14f)
                curveTo(9f, 14.276f, 9.224f, 14.5f, 9.5f, 14.5f)
                curveTo(9.776f, 14.5f, 10f, 14.276f, 10f, 14f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                close()
                moveTo(7.5f, 11.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.5f)
                close()
                moveTo(5.75f, 17.5f)
                curveTo(5.336f, 17.5f, 5f, 17.836f, 5f, 18.25f)
                curveTo(5f, 18.664f, 5.336f, 19f, 5.75f, 19f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 19f, 14f, 18.664f, 14f, 18.25f)
                curveTo(14f, 17.836f, 13.664f, 17.5f, 13.25f, 17.5f)
                horizontalLineTo(5.75f)
                close()
            }
        }.build()

        return _Microscope!!
    }

@Suppress("ObjectPropertyName")
private var _Microscope: ImageVector? = null

@Preview
@Composable
private fun MicroscopePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Microscope, contentDescription = null)
    }
}
