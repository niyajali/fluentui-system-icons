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

public val FluentUi.Filled.Predictions: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Predictions",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.683f, 14.926f)
            lineTo(17.967f, 18.78f)
            curveTo(18.234f, 19.579f, 17.893f, 20.454f, 17.157f, 20.863f)
            curveTo(15.786f, 21.626f, 14.064f, 22f, 12f, 22f)
            curveTo(9.936f, 22f, 8.214f, 21.626f, 6.843f, 20.863f)
            curveTo(6.107f, 20.454f, 5.766f, 19.579f, 6.033f, 18.78f)
            lineTo(7.318f, 14.926f)
            curveTo(8.618f, 15.914f, 10.241f, 16.5f, 12f, 16.5f)
            curveTo(13.759f, 16.5f, 15.382f, 15.914f, 16.683f, 14.926f)
            close()
            moveTo(12f, 2f)
            curveTo(13.337f, 2f, 14.582f, 2.388f, 15.631f, 3.059f)
            curveTo(15.548f, 3.372f, 15.422f, 3.603f, 15.263f, 3.763f)
            curveTo(15.01f, 4.015f, 14.58f, 4.183f, 13.938f, 4.234f)
            lineTo(13.716f, 4.246f)
            lineTo(13.337f, 4.256f)
            curveTo(11.168f, 4.415f, 11.222f, 7.75f, 13.5f, 7.75f)
            curveTo(14.39f, 7.75f, 14.957f, 7.931f, 15.263f, 8.237f)
            curveTo(15.515f, 8.49f, 15.683f, 8.92f, 15.734f, 9.562f)
            lineTo(15.746f, 9.784f)
            lineTo(15.756f, 10.163f)
            curveTo(15.852f, 11.477f, 17.114f, 11.975f, 18.094f, 11.657f)
            curveTo(17.008f, 13.93f, 14.687f, 15.5f, 12f, 15.5f)
            curveTo(8.272f, 15.5f, 5.25f, 12.478f, 5.25f, 8.75f)
            curveTo(5.25f, 5.022f, 8.272f, 2f, 12f, 2f)
            close()
            moveTo(18.25f, 2f)
            curveTo(18.25f, 3.15f, 18.52f, 3.959f, 19.03f, 4.47f)
            curveTo(19.501f, 4.941f, 20.228f, 5.207f, 21.241f, 5.245f)
            lineTo(21.5f, 5.25f)
            curveTo(22.458f, 5.25f, 22.498f, 6.628f, 21.62f, 6.742f)
            lineTo(21.5f, 6.75f)
            curveTo(20.35f, 6.75f, 19.541f, 7.02f, 19.03f, 7.53f)
            curveTo(18.559f, 8.002f, 18.293f, 8.728f, 18.255f, 9.741f)
            lineTo(18.25f, 10f)
            curveTo(18.25f, 11f, 16.75f, 11f, 16.75f, 10f)
            curveTo(16.75f, 8.85f, 16.48f, 8.041f, 15.97f, 7.53f)
            curveTo(15.498f, 7.059f, 14.772f, 6.793f, 13.759f, 6.755f)
            lineTo(13.5f, 6.75f)
            curveTo(12.542f, 6.75f, 12.502f, 5.372f, 13.38f, 5.258f)
            lineTo(13.5f, 5.25f)
            curveTo(14.65f, 5.25f, 15.459f, 4.98f, 15.97f, 4.47f)
            curveTo(16.48f, 3.959f, 16.75f, 3.15f, 16.75f, 2f)
            curveTo(16.75f, 1f, 18.25f, 1f, 18.25f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PredictionsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Predictions, contentDescription = null)
    }
}
