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

public val FluentIcons.Filled.Flowchart: ImageVector
    get() {
        if (_Flowchart != null) {
            return _Flowchart!!
        }
        _Flowchart = ImageVector.Builder(
            name = "Filled.Flowchart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.998f, 5.246f)
                curveTo(2.998f, 4.003f, 4.005f, 2.996f, 5.248f, 2.996f)
                horizontalLineTo(7.755f)
                curveTo(8.997f, 2.996f, 10.005f, 4.003f, 10.005f, 5.246f)
                verticalLineTo(7.753f)
                curveTo(10.005f, 8.996f, 8.997f, 10.003f, 7.755f, 10.003f)
                horizontalLineTo(7.25f)
                verticalLineTo(13.71f)
                curveTo(7.297f, 13.745f, 7.341f, 13.783f, 7.384f, 13.826f)
                lineTo(10.174f, 16.617f)
                curveTo(10.217f, 16.66f, 10.256f, 16.704f, 10.291f, 16.751f)
                horizontalLineTo(14.005f)
                verticalLineTo(16.25f)
                curveTo(14.005f, 15.008f, 15.012f, 14f, 16.255f, 14f)
                horizontalLineTo(18.749f)
                curveTo(19.991f, 14f, 20.999f, 15.008f, 20.999f, 16.25f)
                verticalLineTo(18.755f)
                curveTo(20.999f, 19.997f, 19.991f, 21.005f, 18.749f, 21.005f)
                horizontalLineTo(16.255f)
                curveTo(15.012f, 21.005f, 14.005f, 19.997f, 14.005f, 18.755f)
                verticalLineTo(18.251f)
                horizontalLineTo(10.29f)
                curveTo(10.255f, 18.298f, 10.217f, 18.342f, 10.175f, 18.384f)
                lineTo(7.384f, 21.176f)
                curveTo(6.896f, 21.665f, 6.104f, 21.665f, 5.616f, 21.177f)
                lineTo(2.824f, 18.385f)
                curveTo(2.335f, 17.896f, 2.335f, 17.105f, 2.824f, 16.617f)
                lineTo(5.616f, 13.825f)
                curveTo(5.658f, 13.783f, 5.703f, 13.744f, 5.75f, 13.709f)
                verticalLineTo(10.003f)
                horizontalLineTo(5.248f)
                curveTo(4.005f, 10.003f, 2.998f, 8.996f, 2.998f, 7.753f)
                lineTo(2.998f, 5.246f)
                close()
            }
        }.build()

        return _Flowchart!!
    }

@Suppress("ObjectPropertyName")
private var _Flowchart: ImageVector? = null

@Preview
@Composable
private fun FlowchartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Flowchart, contentDescription = null)
    }
}
