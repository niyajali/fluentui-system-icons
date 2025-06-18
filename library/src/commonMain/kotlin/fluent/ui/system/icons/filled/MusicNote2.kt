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

public val FluentUi.Filled.MusicNote2: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MusicNote2",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20f, 2.75f)
            curveTo(20f, 2.513f, 19.888f, 2.29f, 19.698f, 2.148f)
            curveTo(19.507f, 2.007f, 19.262f, 1.964f, 19.035f, 2.032f)
            lineTo(9.034f, 5.032f)
            curveTo(8.717f, 5.127f, 8.5f, 5.419f, 8.5f, 5.75f)
            verticalLineTo(15.627f)
            curveTo(7.933f, 15.232f, 7.244f, 15f, 6.5f, 15f)
            curveTo(4.567f, 15f, 3f, 16.567f, 3f, 18.5f)
            curveTo(3f, 20.433f, 4.567f, 22f, 6.5f, 22f)
            curveTo(8.433f, 22f, 10f, 20.433f, 10f, 18.5f)
            curveTo(10f, 18.443f, 9.999f, 18.386f, 9.996f, 18.329f)
            curveTo(9.999f, 18.303f, 10f, 18.277f, 10f, 18.25f)
            verticalLineTo(10.308f)
            lineTo(18.5f, 7.758f)
            verticalLineTo(13.627f)
            curveTo(17.933f, 13.232f, 17.244f, 13f, 16.5f, 13f)
            curveTo(14.567f, 13f, 13f, 14.567f, 13f, 16.5f)
            curveTo(13f, 18.433f, 14.567f, 20f, 16.5f, 20f)
            curveTo(18.433f, 20f, 20f, 18.433f, 20f, 16.5f)
            curveTo(20f, 16.443f, 19.999f, 16.386f, 19.996f, 16.329f)
            curveTo(19.999f, 16.303f, 20f, 16.277f, 20f, 16.25f)
            verticalLineTo(2.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MusicNote2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MusicNote2, contentDescription = null)
    }
}
