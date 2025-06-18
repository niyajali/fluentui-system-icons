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

public val FluentUi.Filled.ArrowDownload: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownload",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 3f)
            curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
            curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
            verticalLineTo(15.086f)
            lineTo(7.707f, 11.793f)
            curveTo(7.317f, 11.402f, 6.683f, 11.402f, 6.293f, 11.793f)
            curveTo(5.902f, 12.183f, 5.902f, 12.817f, 6.293f, 13.207f)
            lineTo(11.293f, 18.207f)
            curveTo(11.683f, 18.598f, 12.317f, 18.598f, 12.707f, 18.207f)
            lineTo(17.707f, 13.207f)
            curveTo(18.098f, 12.817f, 18.098f, 12.183f, 17.707f, 11.793f)
            curveTo(17.317f, 11.402f, 16.683f, 11.402f, 16.293f, 11.793f)
            lineTo(13f, 15.086f)
            verticalLineTo(3f)
            close()
            moveTo(5f, 20f)
            curveTo(4.448f, 20f, 4f, 20.448f, 4f, 21f)
            curveTo(4f, 21.552f, 4.448f, 22f, 5f, 22f)
            horizontalLineTo(19f)
            curveTo(19.552f, 22f, 20f, 21.552f, 20f, 21f)
            curveTo(20f, 20.448f, 19.552f, 20f, 19f, 20f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowDownloadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowDownload, contentDescription = null)
    }
}
