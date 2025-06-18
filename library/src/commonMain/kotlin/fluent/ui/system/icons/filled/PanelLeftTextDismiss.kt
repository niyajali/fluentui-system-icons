package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.PanelLeftTextDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelLeftTextDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineTo(12.81f)
            curveTo(21.556f, 12.383f, 21.051f, 12.019f, 20.5f, 11.732f)
            verticalLineTo(7.25f)
            curveTo(20.5f, 6.284f, 19.716f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(10f)
            verticalLineTo(18.5f)
            horizontalLineTo(11.076f)
            curveTo(11.157f, 19.023f, 11.3f, 19.526f, 11.498f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(4.75f, 8.5f)
            curveTo(4.75f, 8.914f, 5.086f, 9.25f, 5.5f, 9.25f)
            horizontalLineTo(6.75f)
            curveTo(7.164f, 9.25f, 7.5f, 8.914f, 7.5f, 8.5f)
            curveTo(7.5f, 8.086f, 7.164f, 7.75f, 6.75f, 7.75f)
            horizontalLineTo(5.5f)
            curveTo(5.086f, 7.75f, 4.75f, 8.086f, 4.75f, 8.5f)
            close()
            moveTo(4.75f, 12f)
            curveTo(4.75f, 12.414f, 5.086f, 12.75f, 5.5f, 12.75f)
            horizontalLineTo(6.75f)
            curveTo(7.164f, 12.75f, 7.5f, 12.414f, 7.5f, 12f)
            curveTo(7.5f, 11.586f, 7.164f, 11.25f, 6.75f, 11.25f)
            horizontalLineTo(5.5f)
            curveTo(5.086f, 11.25f, 4.75f, 11.586f, 4.75f, 12f)
            close()
            moveTo(5.5f, 14.75f)
            curveTo(5.086f, 14.75f, 4.75f, 15.086f, 4.75f, 15.5f)
            curveTo(4.75f, 15.914f, 5.086f, 16.25f, 5.5f, 16.25f)
            horizontalLineTo(6.75f)
            curveTo(7.164f, 16.25f, 7.5f, 15.914f, 7.5f, 15.5f)
            curveTo(7.5f, 15.086f, 7.164f, 14.75f, 6.75f, 14.75f)
            horizontalLineTo(5.5f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(15.854f, 15.146f)
            curveTo(15.658f, 14.951f, 15.342f, 14.951f, 15.146f, 15.146f)
            curveTo(14.951f, 15.342f, 14.951f, 15.658f, 15.146f, 15.854f)
            lineTo(16.793f, 17.5f)
            lineTo(15.146f, 19.146f)
            curveTo(14.951f, 19.342f, 14.951f, 19.658f, 15.146f, 19.854f)
            curveTo(15.342f, 20.049f, 15.658f, 20.049f, 15.854f, 19.854f)
            lineTo(17.5f, 18.207f)
            lineTo(19.146f, 19.854f)
            curveTo(19.342f, 20.049f, 19.658f, 20.049f, 19.854f, 19.854f)
            curveTo(20.049f, 19.658f, 20.049f, 19.342f, 19.854f, 19.146f)
            lineTo(18.207f, 17.5f)
            lineTo(19.854f, 15.854f)
            curveTo(20.049f, 15.658f, 20.049f, 15.342f, 19.854f, 15.146f)
            curveTo(19.658f, 14.951f, 19.342f, 14.951f, 19.146f, 15.146f)
            lineTo(17.5f, 16.793f)
            lineTo(15.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PanelLeftTextDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PanelLeftTextDismiss, contentDescription = null)
    }
}
