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

public val FluentUi.Regular.Location: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Location",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.843f, 4.568f)
            curveTo(9.244f, 1.168f, 14.757f, 1.168f, 18.157f, 4.568f)
            curveTo(21.558f, 7.969f, 21.558f, 13.482f, 18.157f, 16.882f)
            lineTo(16.97f, 18.056f)
            curveTo(16.095f, 18.915f, 14.96f, 20.019f, 13.564f, 21.368f)
            curveTo(12.692f, 22.212f, 11.308f, 22.212f, 10.436f, 21.368f)
            lineTo(6.945f, 17.972f)
            curveTo(6.506f, 17.541f, 6.139f, 17.178f, 5.843f, 16.882f)
            curveTo(2.443f, 13.482f, 2.443f, 7.969f, 5.843f, 4.568f)
            close()
            moveTo(17.097f, 5.629f)
            curveTo(14.282f, 2.814f, 9.719f, 2.814f, 6.904f, 5.629f)
            curveTo(4.089f, 8.444f, 4.089f, 13.007f, 6.904f, 15.822f)
            lineTo(8.391f, 17.289f)
            curveTo(9.21f, 18.09f, 10.239f, 19.091f, 11.479f, 20.29f)
            curveTo(11.77f, 20.571f, 12.231f, 20.571f, 12.522f, 20.29f)
            lineTo(15.917f, 16.989f)
            curveTo(16.386f, 16.528f, 16.779f, 16.139f, 17.097f, 15.822f)
            curveTo(19.911f, 13.007f, 19.911f, 8.444f, 17.097f, 5.629f)
            close()
            moveTo(12f, 7.999f)
            curveTo(13.658f, 7.999f, 15.002f, 9.343f, 15.002f, 11f)
            curveTo(15.002f, 12.658f, 13.658f, 14.002f, 12f, 14.002f)
            curveTo(10.343f, 14.002f, 8.999f, 12.658f, 8.999f, 11f)
            curveTo(8.999f, 9.343f, 10.343f, 7.999f, 12f, 7.999f)
            close()
            moveTo(12f, 9.499f)
            curveTo(11.171f, 9.499f, 10.499f, 10.171f, 10.499f, 11f)
            curveTo(10.499f, 11.83f, 11.171f, 12.502f, 12f, 12.502f)
            curveTo(12.83f, 12.502f, 13.502f, 11.83f, 13.502f, 11f)
            curveTo(13.502f, 10.171f, 12.83f, 9.499f, 12f, 9.499f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LocationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Location, contentDescription = null)
    }
}
