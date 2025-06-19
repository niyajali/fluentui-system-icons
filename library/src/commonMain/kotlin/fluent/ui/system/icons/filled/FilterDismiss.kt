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

public val FluentIcons.Filled.FilterDismiss: ImageVector
    get() {
        if (_FilterDismiss != null) {
            return _FilterDismiss!!
        }
        _FilterDismiss = ImageVector.Builder(
            name = "Filled.FilterDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 7.5f)
                curveTo(23f, 10.538f, 20.538f, 13f, 17.5f, 13f)
                curveTo(14.462f, 13f, 12f, 10.538f, 12f, 7.5f)
                curveTo(12f, 4.462f, 14.462f, 2f, 17.5f, 2f)
                curveTo(20.538f, 2f, 23f, 4.462f, 23f, 7.5f)
                close()
                moveTo(15.854f, 5.146f)
                curveTo(15.658f, 4.951f, 15.342f, 4.951f, 15.146f, 5.146f)
                curveTo(14.951f, 5.342f, 14.951f, 5.658f, 15.146f, 5.854f)
                lineTo(16.793f, 7.5f)
                lineTo(15.146f, 9.146f)
                curveTo(14.951f, 9.342f, 14.951f, 9.658f, 15.146f, 9.854f)
                curveTo(15.342f, 10.049f, 15.658f, 10.049f, 15.854f, 9.854f)
                lineTo(17.5f, 8.207f)
                lineTo(19.146f, 9.854f)
                curveTo(19.342f, 10.049f, 19.658f, 10.049f, 19.854f, 9.854f)
                curveTo(20.049f, 9.658f, 20.049f, 9.342f, 19.854f, 9.146f)
                lineTo(18.207f, 7.5f)
                lineTo(19.854f, 5.854f)
                curveTo(20.049f, 5.658f, 20.049f, 5.342f, 19.854f, 5.146f)
                curveTo(19.658f, 4.951f, 19.342f, 4.951f, 19.146f, 5.146f)
                lineTo(17.5f, 6.793f)
                lineTo(15.854f, 5.146f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 11f)
                horizontalLineTo(12.022f)
                curveTo(12.537f, 11.805f, 13.226f, 12.489f, 14.034f, 13f)
                horizontalLineTo(8f)
                curveTo(7.448f, 13f, 7f, 12.552f, 7f, 12f)
                curveTo(7f, 11.487f, 7.386f, 11.064f, 7.883f, 11.007f)
                lineTo(8f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5f, 6f)
                horizontalLineTo(11.174f)
                curveTo(11.06f, 6.482f, 11f, 6.984f, 11f, 7.5f)
                curveTo(11f, 7.668f, 11.006f, 7.835f, 11.019f, 8f)
                horizontalLineTo(5f)
                curveTo(4.448f, 8f, 4f, 7.552f, 4f, 7f)
                curveTo(4f, 6.487f, 4.386f, 6.064f, 4.883f, 6.007f)
                lineTo(5f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.883f, 16.007f)
                lineTo(10f, 16f)
                horizontalLineTo(14f)
                curveTo(14.552f, 16f, 15f, 16.448f, 15f, 17f)
                curveTo(15f, 17.513f, 14.614f, 17.935f, 14.117f, 17.993f)
                lineTo(14f, 18f)
                horizontalLineTo(10f)
                curveTo(9.448f, 18f, 9f, 17.552f, 9f, 17f)
                curveTo(9f, 16.487f, 9.386f, 16.065f, 9.883f, 16.007f)
                close()
            }
        }.build()

        return _FilterDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _FilterDismiss: ImageVector? = null

@Preview
@Composable
private fun FilterDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FilterDismiss, contentDescription = null)
    }
}
