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

public val FluentIcons.Filled.HeadsetAdd: ImageVector
    get() {
        if (_HeadsetAdd != null) {
            return _HeadsetAdd!!
        }
        _HeadsetAdd = ImageVector.Builder(
            name = "Filled.HeadsetAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 6.5f)
                curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
                curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
                curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 9.538f, 23f, 6.5f)
                close()
                moveTo(18.001f, 7f)
                lineTo(18.001f, 9.504f)
                curveTo(18.001f, 9.78f, 17.777f, 10.003f, 17.501f, 10.003f)
                curveTo(17.225f, 10.003f, 17.001f, 9.78f, 17.001f, 9.504f)
                lineTo(17.001f, 7f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 7f, 13.996f, 6.776f, 13.996f, 6.5f)
                curveTo(13.996f, 6.224f, 14.22f, 6f, 14.496f, 6f)
                horizontalLineTo(17f)
                lineTo(17f, 3.499f)
                curveTo(17f, 3.223f, 17.224f, 2.999f, 17.5f, 2.999f)
                curveTo(17.776f, 2.999f, 18f, 3.223f, 18f, 3.499f)
                lineTo(18f, 6f)
                horizontalLineTo(20.497f)
                curveTo(20.772f, 6f, 20.996f, 6.224f, 20.996f, 6.5f)
                curveTo(20.996f, 6.776f, 20.772f, 7f, 20.497f, 7f)
                horizontalLineTo(18.001f)
                close()
                moveTo(17.5f, 13f)
                curveTo(18.016f, 13f, 18.518f, 12.94f, 19f, 12.826f)
                verticalLineTo(15f)
                curveTo(19f, 16.105f, 18.105f, 17f, 17f, 17f)
                horizontalLineTo(15f)
                curveTo(14.448f, 17f, 14f, 16.552f, 14f, 16f)
                verticalLineTo(12f)
                lineTo(14f, 11.978f)
                curveTo(15.01f, 12.625f, 16.212f, 13f, 17.5f, 13f)
                close()
                moveTo(12.022f, 3f)
                curveTo(11.717f, 3.476f, 11.473f, 3.994f, 11.299f, 4.544f)
                curveTo(8.593f, 4.888f, 6.5f, 7.2f, 6.5f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                curveTo(9.552f, 11f, 10f, 11.448f, 10f, 12f)
                verticalLineTo(16f)
                curveTo(10f, 16.552f, 9.552f, 17f, 9f, 17f)
                horizontalLineTo(7f)
                curveTo(6.827f, 17f, 6.66f, 16.978f, 6.5f, 16.937f)
                lineTo(6.5f, 17.25f)
                curveTo(6.5f, 18.441f, 7.425f, 19.416f, 8.596f, 19.495f)
                lineTo(8.75f, 19.5f)
                lineTo(9.878f, 19.501f)
                curveTo(10.186f, 18.626f, 11.02f, 18f, 12f, 18f)
                curveTo(13.243f, 18f, 14.25f, 19.007f, 14.25f, 20.25f)
                curveTo(14.25f, 21.493f, 13.243f, 22.5f, 12f, 22.5f)
                curveTo(11.02f, 22.5f, 10.187f, 21.874f, 9.878f, 21f)
                lineTo(8.75f, 21f)
                curveTo(6.746f, 21f, 5.109f, 19.428f, 5.005f, 17.449f)
                lineTo(5f, 17.25f)
                verticalLineTo(10f)
                curveTo(5f, 6.134f, 8.134f, 3f, 12f, 3f)
                lineTo(12.022f, 3f)
                close()
            }
        }.build()

        return _HeadsetAdd!!
    }

@Suppress("ObjectPropertyName")
private var _HeadsetAdd: ImageVector? = null

@Preview
@Composable
private fun HeadsetAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HeadsetAdd, contentDescription = null)
    }
}
