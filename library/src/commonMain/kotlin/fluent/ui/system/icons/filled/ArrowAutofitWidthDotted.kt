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

public val FluentIcons.Filled.ArrowAutofitWidthDotted: ImageVector
    get() {
        if (_ArrowAutofitWidthDotted != null) {
            return _ArrowAutofitWidthDotted!!
        }
        _ArrowAutofitWidthDotted = ImageVector.Builder(
            name = "Filled.ArrowAutofitWidthDotted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.008f, 6.5f)
                curveTo(20.008f, 5.119f, 18.889f, 4f, 17.508f, 4f)
                horizontalLineTo(6.508f)
                curveTo(5.127f, 4f, 4.008f, 5.119f, 4.008f, 6.5f)
                lineTo(4.008f, 10.5f)
                curveTo(4.008f, 11.052f, 4.456f, 11.5f, 5.008f, 11.5f)
                curveTo(5.56f, 11.5f, 6.008f, 11.052f, 6.008f, 10.5f)
                lineTo(6.008f, 6.5f)
                curveTo(6.008f, 6.224f, 6.232f, 6f, 6.508f, 6f)
                lineTo(17.508f, 6f)
                curveTo(17.784f, 6f, 18.008f, 6.224f, 18.008f, 6.5f)
                verticalLineTo(10.5f)
                curveTo(18.008f, 11.052f, 18.455f, 11.5f, 19.008f, 11.5f)
                curveTo(19.56f, 11.5f, 20.008f, 11.052f, 20.008f, 10.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(18.207f, 19.707f)
                lineTo(20.707f, 17.207f)
                curveTo(21.098f, 16.817f, 21.098f, 16.183f, 20.707f, 15.793f)
                lineTo(18.207f, 13.293f)
                curveTo(17.817f, 12.902f, 17.183f, 12.902f, 16.793f, 13.293f)
                curveTo(16.402f, 13.683f, 16.402f, 14.317f, 16.793f, 14.707f)
                lineTo(18.586f, 16.5f)
                lineTo(16.793f, 18.293f)
                curveTo(16.402f, 18.683f, 16.402f, 19.317f, 16.793f, 19.707f)
                curveTo(17.183f, 20.098f, 17.817f, 20.098f, 18.207f, 19.707f)
                close()
                moveTo(3.293f, 15.793f)
                curveTo(2.902f, 16.183f, 2.902f, 16.817f, 3.293f, 17.207f)
                lineTo(5.793f, 19.707f)
                curveTo(6.183f, 20.098f, 6.817f, 20.098f, 7.207f, 19.707f)
                curveTo(7.598f, 19.317f, 7.598f, 18.683f, 7.207f, 18.293f)
                lineTo(5.414f, 16.5f)
                lineTo(7.207f, 14.707f)
                curveTo(7.598f, 14.317f, 7.598f, 13.683f, 7.207f, 13.293f)
                curveTo(6.817f, 12.902f, 6.183f, 12.902f, 5.793f, 13.293f)
                lineTo(3.293f, 15.793f)
                close()
                moveTo(13f, 16.5f)
                curveTo(13f, 15.948f, 12.552f, 15.5f, 12f, 15.5f)
                curveTo(11.448f, 15.5f, 11f, 15.948f, 11f, 16.5f)
                curveTo(11f, 17.052f, 11.448f, 17.5f, 12f, 17.5f)
                curveTo(12.552f, 17.5f, 13f, 17.052f, 13f, 16.5f)
                close()
                moveTo(9f, 15.5f)
                curveTo(9.552f, 15.5f, 10f, 15.948f, 10f, 16.5f)
                curveTo(10f, 17.052f, 9.552f, 17.5f, 9f, 17.5f)
                horizontalLineTo(8f)
                curveTo(7.448f, 17.5f, 7f, 17.052f, 7f, 16.5f)
                curveTo(7f, 15.948f, 7.448f, 15.5f, 8f, 15.5f)
                horizontalLineTo(9f)
                close()
                moveTo(17f, 16.5f)
                curveTo(17f, 15.948f, 16.552f, 15.5f, 16f, 15.5f)
                horizontalLineTo(15f)
                curveTo(14.448f, 15.5f, 14f, 15.948f, 14f, 16.5f)
                curveTo(14f, 17.052f, 14.448f, 17.5f, 15f, 17.5f)
                horizontalLineTo(16f)
                curveTo(16.552f, 17.5f, 17f, 17.052f, 17f, 16.5f)
                close()
            }
        }.build()

        return _ArrowAutofitWidthDotted!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowAutofitWidthDotted: ImageVector? = null

@Preview
@Composable
private fun ArrowAutofitWidthDottedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowAutofitWidthDotted, contentDescription = null)
    }
}
