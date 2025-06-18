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

public val FluentUi.Regular.Calendar3Day: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Calendar3Day",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
            moveTo(7.75f, 7f)
            curveTo(8.13f, 7f, 8.443f, 7.282f, 8.493f, 7.648f)
            lineTo(8.5f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(8.5f, 16.664f, 8.164f, 17f, 7.75f, 17f)
            curveTo(7.37f, 17f, 7.057f, 16.718f, 7.007f, 16.352f)
            lineTo(7f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(7f, 7.336f, 7.336f, 7f, 7.75f, 7f)
            close()
            moveTo(16.25f, 7f)
            curveTo(16.63f, 7f, 16.944f, 7.282f, 16.993f, 7.648f)
            lineTo(17f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(17f, 16.664f, 16.664f, 17f, 16.25f, 17f)
            curveTo(15.87f, 17f, 15.557f, 16.718f, 15.507f, 16.352f)
            lineTo(15.5f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(15.5f, 7.336f, 15.836f, 7f, 16.25f, 7f)
            close()
            moveTo(12f, 7f)
            curveTo(12.38f, 7f, 12.693f, 7.282f, 12.743f, 7.648f)
            lineTo(12.75f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(12.75f, 16.664f, 12.414f, 17f, 12f, 17f)
            curveTo(11.62f, 17f, 11.307f, 16.718f, 11.257f, 16.352f)
            lineTo(11.25f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(11.25f, 7.336f, 11.586f, 7f, 12f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Calendar3DayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Calendar3Day, contentDescription = null)
    }
}
