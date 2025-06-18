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

public val FluentUi.Filled.ArrowExportUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExportUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.707f, 2.293f)
            curveTo(12.317f, 1.902f, 11.683f, 1.902f, 11.293f, 2.293f)
            lineTo(6.293f, 7.293f)
            curveTo(5.902f, 7.683f, 5.902f, 8.317f, 6.293f, 8.707f)
            curveTo(6.683f, 9.098f, 7.317f, 9.098f, 7.707f, 8.707f)
            lineTo(11f, 5.414f)
            verticalLineTo(18f)
            curveTo(11f, 18.552f, 11.448f, 19f, 12f, 19f)
            curveTo(12.552f, 19f, 13f, 18.552f, 13f, 18f)
            verticalLineTo(5.414f)
            lineTo(16.293f, 8.707f)
            curveTo(16.683f, 9.098f, 17.317f, 9.098f, 17.707f, 8.707f)
            curveTo(18.098f, 8.317f, 18.098f, 7.683f, 17.707f, 7.293f)
            lineTo(12.707f, 2.293f)
            close()
            moveTo(5.25f, 20.5f)
            curveTo(4.836f, 20.5f, 4.5f, 20.836f, 4.5f, 21.25f)
            curveTo(4.5f, 21.664f, 4.836f, 22f, 5.25f, 22f)
            horizontalLineTo(18.75f)
            curveTo(19.164f, 22f, 19.5f, 21.664f, 19.5f, 21.25f)
            curveTo(19.5f, 20.836f, 19.164f, 20.5f, 18.75f, 20.5f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowExportUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowExportUp, contentDescription = null)
    }
}
