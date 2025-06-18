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

public val FluentUi.Filled.TargetEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TargetEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.999f, 13.999f)
            curveTo(13.104f, 13.999f, 13.999f, 13.104f, 13.999f, 11.999f)
            curveTo(13.999f, 10.895f, 13.104f, 9.999f, 11.999f, 9.999f)
            curveTo(10.895f, 9.999f, 9.999f, 10.895f, 9.999f, 11.999f)
            curveTo(9.999f, 13.104f, 10.895f, 13.999f, 11.999f, 13.999f)
            close()
            moveTo(6f, 11.999f)
            curveTo(6f, 8.686f, 8.686f, 6f, 11.999f, 6f)
            curveTo(15.313f, 6f, 17.999f, 8.686f, 17.999f, 11.999f)
            curveTo(17.999f, 12.122f, 17.995f, 12.244f, 17.988f, 12.365f)
            lineTo(12.489f, 17.863f)
            curveTo(12.449f, 17.904f, 12.41f, 17.945f, 12.371f, 17.987f)
            curveTo(12.248f, 17.995f, 12.124f, 17.999f, 11.999f, 17.999f)
            curveTo(8.686f, 17.999f, 6f, 15.313f, 6f, 11.999f)
            close()
            moveTo(11.999f, 7.999f)
            curveTo(9.79f, 7.999f, 7.999f, 9.79f, 7.999f, 11.999f)
            curveTo(7.999f, 14.208f, 9.79f, 15.999f, 11.999f, 15.999f)
            curveTo(14.208f, 15.999f, 15.999f, 14.208f, 15.999f, 11.999f)
            curveTo(15.999f, 9.79f, 14.208f, 7.999f, 11.999f, 7.999f)
            close()
            moveTo(11.999f, 4f)
            curveTo(16.11f, 4f, 19.496f, 7.1f, 19.947f, 11.09f)
            curveTo(20.617f, 10.929f, 21.327f, 10.982f, 21.971f, 11.248f)
            curveTo(21.586f, 6.076f, 17.269f, 2f, 11.999f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 11.999f)
            curveTo(2f, 17.184f, 5.946f, 21.447f, 10.998f, 21.949f)
            curveTo(10.996f, 21.772f, 11.017f, 21.59f, 11.063f, 21.406f)
            lineTo(11.42f, 19.978f)
            curveTo(7.272f, 19.681f, 4f, 16.222f, 4f, 11.999f)
            curveTo(4f, 7.581f, 7.581f, 4f, 11.999f, 4f)
            close()
            moveTo(19.098f, 12.669f)
            lineTo(13.196f, 18.57f)
            curveTo(12.852f, 18.915f, 12.608f, 19.346f, 12.49f, 19.818f)
            lineTo(12.033f, 21.648f)
            curveTo(11.834f, 22.444f, 12.555f, 23.166f, 13.351f, 22.967f)
            lineTo(15.181f, 22.509f)
            curveTo(15.653f, 22.391f, 16.085f, 22.147f, 16.429f, 21.803f)
            lineTo(22.331f, 15.901f)
            curveTo(23.223f, 15.008f, 23.223f, 13.561f, 22.331f, 12.669f)
            curveTo(21.438f, 11.776f, 19.991f, 11.776f, 19.098f, 12.669f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TargetEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TargetEdit, contentDescription = null)
    }
}
