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

public val FluentUi.Filled.ArrowReset: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowReset",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.207f, 2.543f)
            curveTo(7.598f, 2.933f, 7.598f, 3.567f, 7.207f, 3.957f)
            lineTo(5.414f, 5.75f)
            horizontalLineTo(13.25f)
            curveTo(17.668f, 5.75f, 21.25f, 9.332f, 21.25f, 13.75f)
            curveTo(21.25f, 18.168f, 17.668f, 21.75f, 13.25f, 21.75f)
            curveTo(8.832f, 21.75f, 5.25f, 18.168f, 5.25f, 13.75f)
            curveTo(5.25f, 13.198f, 5.698f, 12.75f, 6.25f, 12.75f)
            curveTo(6.802f, 12.75f, 7.25f, 13.198f, 7.25f, 13.75f)
            curveTo(7.25f, 17.064f, 9.936f, 19.75f, 13.25f, 19.75f)
            curveTo(16.564f, 19.75f, 19.25f, 17.064f, 19.25f, 13.75f)
            curveTo(19.25f, 10.436f, 16.564f, 7.75f, 13.25f, 7.75f)
            horizontalLineTo(5.414f)
            lineTo(7.207f, 9.543f)
            curveTo(7.598f, 9.933f, 7.598f, 10.567f, 7.207f, 10.957f)
            curveTo(6.817f, 11.348f, 6.183f, 11.348f, 5.793f, 10.957f)
            lineTo(2.293f, 7.457f)
            curveTo(1.902f, 7.067f, 1.902f, 6.433f, 2.293f, 6.043f)
            lineTo(5.793f, 2.543f)
            curveTo(6.183f, 2.152f, 6.817f, 2.152f, 7.207f, 2.543f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowResetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowReset, contentDescription = null)
    }
}
