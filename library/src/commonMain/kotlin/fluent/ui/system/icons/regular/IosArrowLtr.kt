package fluent.ui.system.icons.regular

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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.IosArrowLtr: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.IosArrowLtr",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.296f, 12f)
            lineTo(12.788f, 3.273f)
            curveTo(13.076f, 2.976f, 13.07f, 2.501f, 12.773f, 2.212f)
            curveTo(12.476f, 1.924f, 12.001f, 1.93f, 11.712f, 2.227f)
            lineTo(2.712f, 11.477f)
            curveTo(2.429f, 11.768f, 2.429f, 12.232f, 2.712f, 12.523f)
            lineTo(11.712f, 21.773f)
            curveTo(12.001f, 22.07f, 12.476f, 22.076f, 12.773f, 21.788f)
            curveTo(13.07f, 21.499f, 13.076f, 21.024f, 12.788f, 20.727f)
            lineTo(4.296f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun IosArrowLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.IosArrowLtr, contentDescription = null)
    }
}
