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

public val FluentUi.Filled.ShiftsActivity: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShiftsActivity",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.109f, 4.049f)
            curveTo(11.658f, 3.988f, 12.054f, 3.494f, 11.993f, 2.945f)
            curveTo(11.932f, 2.396f, 11.438f, 2f, 10.889f, 2.061f)
            curveTo(5.889f, 2.614f, 2f, 6.852f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.146f, 22f, 21.383f, 18.113f, 21.938f, 13.115f)
            curveTo(21.999f, 12.566f, 21.604f, 12.071f, 21.055f, 12.01f)
            curveTo(20.506f, 11.949f, 20.012f, 12.345f, 19.951f, 12.894f)
            curveTo(19.507f, 16.891f, 16.116f, 20f, 12f, 20f)
            curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
            curveTo(4f, 7.883f, 7.111f, 4.491f, 11.109f, 4.049f)
            close()
            moveTo(14.767f, 2.391f)
            curveTo(14.236f, 2.242f, 13.684f, 2.552f, 13.534f, 3.083f)
            curveTo(13.385f, 3.615f, 13.695f, 4.167f, 14.226f, 4.316f)
            curveTo(14.514f, 4.397f, 14.796f, 4.494f, 15.069f, 4.606f)
            curveTo(15.58f, 4.815f, 16.164f, 4.57f, 16.373f, 4.058f)
            curveTo(16.582f, 3.547f, 16.337f, 2.963f, 15.826f, 2.754f)
            curveTo(15.482f, 2.614f, 15.129f, 2.492f, 14.767f, 2.391f)
            close()
            moveTo(17.349f, 4.692f)
            curveTo(17.723f, 4.285f, 18.355f, 4.257f, 18.762f, 4.631f)
            curveTo(18.974f, 4.825f, 19.177f, 5.028f, 19.371f, 5.239f)
            curveTo(19.744f, 5.646f, 19.716f, 6.279f, 19.309f, 6.652f)
            curveTo(18.902f, 7.025f, 18.27f, 6.998f, 17.896f, 6.591f)
            curveTo(17.742f, 6.422f, 17.58f, 6.259f, 17.411f, 6.105f)
            curveTo(17.003f, 5.731f, 16.976f, 5.099f, 17.349f, 4.692f)
            close()
            moveTo(11f, 6f)
            curveTo(11.552f, 6f, 12f, 6.448f, 12f, 7f)
            verticalLineTo(12f)
            horizontalLineTo(15f)
            curveTo(15.552f, 12f, 16f, 12.448f, 16f, 13f)
            curveTo(16f, 13.552f, 15.552f, 14f, 15f, 14f)
            horizontalLineTo(11f)
            curveTo(10.448f, 14f, 10f, 13.552f, 10f, 13f)
            verticalLineTo(7f)
            curveTo(10f, 6.448f, 10.448f, 6f, 11f, 6f)
            close()
            moveTo(19.94f, 7.623f)
            curveTo(20.451f, 7.414f, 21.035f, 7.659f, 21.244f, 8.17f)
            curveTo(21.351f, 8.432f, 21.448f, 8.701f, 21.533f, 8.974f)
            curveTo(21.559f, 9.06f, 21.585f, 9.146f, 21.609f, 9.233f)
            curveTo(21.758f, 9.765f, 21.448f, 10.317f, 20.917f, 10.466f)
            curveTo(20.385f, 10.615f, 19.833f, 10.305f, 19.684f, 9.774f)
            curveTo(19.664f, 9.705f, 19.644f, 9.636f, 19.623f, 9.568f)
            curveTo(19.555f, 9.35f, 19.478f, 9.136f, 19.393f, 8.927f)
            curveTo(19.184f, 8.416f, 19.428f, 7.832f, 19.94f, 7.623f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShiftsActivityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShiftsActivity, contentDescription = null)
    }
}
