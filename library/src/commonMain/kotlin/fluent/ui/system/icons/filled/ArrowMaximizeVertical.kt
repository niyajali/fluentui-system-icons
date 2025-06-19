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

public val FluentIcons.Filled.ArrowMaximizeVertical: ImageVector
    get() {
        if (_ArrowMaximizeVertical != null) {
            return _ArrowMaximizeVertical!!
        }
        _ArrowMaximizeVertical = ImageVector.Builder(
            name = "Filled.ArrowMaximizeVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.207f, 6.207f)
                curveTo(14.817f, 6.598f, 14.183f, 6.598f, 13.793f, 6.207f)
                lineTo(13f, 5.414f)
                verticalLineTo(9f)
                curveTo(13f, 9.552f, 12.552f, 10f, 12f, 10f)
                curveTo(11.448f, 10f, 11f, 9.552f, 11f, 9f)
                lineTo(11f, 5.414f)
                lineTo(10.207f, 6.207f)
                curveTo(9.817f, 6.598f, 9.183f, 6.598f, 8.793f, 6.207f)
                curveTo(8.402f, 5.817f, 8.402f, 5.183f, 8.793f, 4.793f)
                lineTo(11.293f, 2.293f)
                curveTo(11.389f, 2.197f, 11.499f, 2.125f, 11.617f, 2.076f)
                curveTo(11.734f, 2.027f, 11.863f, 2f, 11.997f, 2f)
                lineTo(12f, 2f)
                lineTo(12.003f, 2f)
                curveTo(12.258f, 2.001f, 12.513f, 2.098f, 12.707f, 2.293f)
                lineTo(15.207f, 4.793f)
                curveTo(15.598f, 5.183f, 15.598f, 5.817f, 15.207f, 6.207f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5f, 11f)
                curveTo(4.448f, 11f, 4f, 11.448f, 4f, 12f)
                curveTo(4f, 12.552f, 4.448f, 13f, 5f, 13f)
                horizontalLineTo(19f)
                curveTo(19.552f, 13f, 20f, 12.552f, 20f, 12f)
                curveTo(20f, 11.448f, 19.552f, 11f, 19f, 11f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.009f, 22f)
                curveTo(12.142f, 21.999f, 12.268f, 21.972f, 12.383f, 21.924f)
                curveTo(12.501f, 21.875f, 12.611f, 21.803f, 12.707f, 21.707f)
                lineTo(15.207f, 19.207f)
                curveTo(15.598f, 18.817f, 15.598f, 18.183f, 15.207f, 17.793f)
                curveTo(14.817f, 17.402f, 14.183f, 17.402f, 13.793f, 17.793f)
                lineTo(13f, 18.586f)
                verticalLineTo(15f)
                curveTo(13f, 14.448f, 12.552f, 14f, 12f, 14f)
                curveTo(11.448f, 14f, 11f, 14.448f, 11f, 15f)
                lineTo(11f, 18.586f)
                lineTo(10.207f, 17.793f)
                curveTo(9.817f, 17.402f, 9.183f, 17.402f, 8.793f, 17.793f)
                curveTo(8.402f, 18.183f, 8.402f, 18.817f, 8.793f, 19.207f)
                lineTo(11.293f, 21.707f)
                curveTo(11.486f, 21.9f, 11.738f, 21.998f, 11.991f, 22f)
            }
        }.build()

        return _ArrowMaximizeVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowMaximizeVertical: ImageVector? = null

@Preview
@Composable
private fun ArrowMaximizeVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowMaximizeVertical, contentDescription = null)
    }
}
