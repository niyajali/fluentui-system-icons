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

public val FluentUi.Regular.ArrowBidirectionalUpDown: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowBidirectionalUpDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.25f, 5.628f)
            verticalLineTo(18.372f)
            lineTo(7.794f, 14.733f)
            curveTo(7.508f, 14.433f, 7.034f, 14.421f, 6.733f, 14.706f)
            curveTo(6.433f, 14.991f, 6.421f, 15.466f, 6.706f, 15.767f)
            lineTo(11.456f, 20.767f)
            curveTo(11.598f, 20.916f, 11.794f, 21f, 12f, 21f)
            curveTo(12.206f, 21f, 12.402f, 20.916f, 12.544f, 20.767f)
            lineTo(17.294f, 15.767f)
            curveTo(17.579f, 15.466f, 17.567f, 14.991f, 17.267f, 14.706f)
            curveTo(16.966f, 14.421f, 16.492f, 14.433f, 16.206f, 14.733f)
            lineTo(12.75f, 18.372f)
            verticalLineTo(5.628f)
            lineTo(16.206f, 9.267f)
            curveTo(16.492f, 9.567f, 16.966f, 9.579f, 17.267f, 9.294f)
            curveTo(17.567f, 9.008f, 17.579f, 8.534f, 17.294f, 8.233f)
            lineTo(12.545f, 3.235f)
            curveTo(12.408f, 3.09f, 12.215f, 3f, 12f, 3f)
            curveTo(11.785f, 3f, 11.592f, 3.09f, 11.455f, 3.235f)
            lineTo(6.706f, 8.233f)
            curveTo(6.421f, 8.534f, 6.433f, 9.008f, 6.733f, 9.294f)
            curveTo(7.034f, 9.579f, 7.508f, 9.567f, 7.794f, 9.267f)
            lineTo(11.25f, 5.628f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowBidirectionalUpDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowBidirectionalUpDown, contentDescription = null)
    }
}
