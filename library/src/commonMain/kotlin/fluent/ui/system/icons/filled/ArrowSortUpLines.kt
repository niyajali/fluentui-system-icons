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

public val FluentUi.Filled.ArrowSortUpLines: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSortUpLines",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 21f)
            curveTo(18f, 21.552f, 17.552f, 22f, 17f, 22f)
            curveTo(16.448f, 22f, 16f, 21.552f, 16f, 21f)
            verticalLineTo(5.414f)
            lineTo(14.207f, 7.207f)
            curveTo(13.817f, 7.598f, 13.183f, 7.598f, 12.793f, 7.207f)
            curveTo(12.402f, 6.817f, 12.402f, 6.183f, 12.793f, 5.793f)
            lineTo(16.293f, 2.293f)
            curveTo(16.683f, 1.902f, 17.317f, 1.902f, 17.707f, 2.293f)
            lineTo(21.207f, 5.793f)
            curveTo(21.598f, 6.183f, 21.598f, 6.817f, 21.207f, 7.207f)
            curveTo(20.817f, 7.598f, 20.183f, 7.598f, 19.793f, 7.207f)
            lineTo(18f, 5.414f)
            verticalLineTo(21f)
            close()
            moveTo(3f, 20f)
            curveTo(2.448f, 20f, 2f, 19.552f, 2f, 19f)
            curveTo(2f, 18.448f, 2.448f, 18f, 3f, 18f)
            horizontalLineTo(13f)
            curveTo(13.552f, 18f, 14f, 18.448f, 14f, 19f)
            curveTo(14f, 19.552f, 13.552f, 20f, 13f, 20f)
            horizontalLineTo(3f)
            close()
            moveTo(6f, 15f)
            curveTo(6f, 15.552f, 6.448f, 16f, 7f, 16f)
            horizontalLineTo(13f)
            curveTo(13.552f, 16f, 14f, 15.552f, 14f, 15f)
            curveTo(14f, 14.448f, 13.552f, 14f, 13f, 14f)
            horizontalLineTo(7f)
            curveTo(6.448f, 14f, 6f, 14.448f, 6f, 15f)
            close()
            moveTo(11f, 12f)
            curveTo(10.448f, 12f, 10f, 11.552f, 10f, 11f)
            curveTo(10f, 10.448f, 10.448f, 10f, 11f, 10f)
            horizontalLineTo(13f)
            curveTo(13.552f, 10f, 14f, 10.448f, 14f, 11f)
            curveTo(14f, 11.552f, 13.552f, 12f, 13f, 12f)
            horizontalLineTo(11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSortUpLinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowSortUpLines, contentDescription = null)
    }
}
