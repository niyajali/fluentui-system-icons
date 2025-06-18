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

public val FluentUi.Filled.EditOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EditOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 15.061f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.074f, 21.487f, 22.074f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.721f)
            lineTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.988f, 2.22f, 3.281f)
            lineTo(8.939f, 10.001f)
            lineTo(3.941f, 15f)
            curveTo(3.535f, 15.406f, 3.249f, 15.917f, 3.116f, 16.476f)
            lineTo(2.02f, 21.078f)
            curveTo(1.96f, 21.331f, 2.036f, 21.598f, 2.22f, 21.782f)
            curveTo(2.404f, 21.966f, 2.67f, 22.041f, 2.924f, 21.981f)
            lineTo(7.525f, 20.885f)
            curveTo(8.084f, 20.752f, 8.595f, 20.467f, 9.002f, 20.06f)
            lineTo(14f, 15.061f)
            close()
            moveTo(19f, 10.061f)
            lineTo(16.121f, 12.94f)
            lineTo(11.06f, 7.88f)
            lineTo(13.939f, 5.001f)
            lineTo(19f, 10.061f)
            close()
            moveTo(15.891f, 3.048f)
            curveTo(17.288f, 1.651f, 19.554f, 1.651f, 20.952f, 3.048f)
            curveTo(22.349f, 4.445f, 22.349f, 6.711f, 20.952f, 8.109f)
            lineTo(20.06f, 9.001f)
            lineTo(15f, 3.94f)
            lineTo(15.891f, 3.048f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EditOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EditOff, contentDescription = null)
    }
}
