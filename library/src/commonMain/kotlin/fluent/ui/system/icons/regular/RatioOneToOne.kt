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

public val FluentUi.Regular.RatioOneToOne: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RatioOneToOne",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.5f, 8.75f)
            curveTo(8.5f, 8.473f, 8.348f, 8.219f, 8.104f, 8.089f)
            curveTo(7.86f, 7.958f, 7.564f, 7.973f, 7.334f, 8.126f)
            lineTo(5.834f, 9.126f)
            curveTo(5.489f, 9.356f, 5.396f, 9.821f, 5.626f, 10.166f)
            curveTo(5.856f, 10.511f, 6.321f, 10.604f, 6.666f, 10.374f)
            lineTo(7f, 10.151f)
            verticalLineTo(15.25f)
            curveTo(7f, 15.664f, 7.336f, 16f, 7.75f, 16f)
            curveTo(8.164f, 16f, 8.5f, 15.664f, 8.5f, 15.25f)
            verticalLineTo(8.75f)
            close()
            moveTo(17.5f, 8.75f)
            curveTo(17.5f, 8.473f, 17.348f, 8.219f, 17.104f, 8.089f)
            curveTo(16.86f, 7.958f, 16.564f, 7.973f, 16.334f, 8.126f)
            lineTo(14.834f, 9.126f)
            curveTo(14.489f, 9.356f, 14.396f, 9.821f, 14.626f, 10.166f)
            curveTo(14.856f, 10.511f, 15.321f, 10.604f, 15.666f, 10.374f)
            lineTo(16f, 10.151f)
            verticalLineTo(15.25f)
            curveTo(16f, 15.664f, 16.336f, 16f, 16.75f, 16f)
            curveTo(17.164f, 16f, 17.5f, 15.664f, 17.5f, 15.25f)
            verticalLineTo(8.75f)
            close()
            moveTo(13f, 14f)
            curveTo(13f, 14.552f, 12.552f, 15f, 12f, 15f)
            curveTo(11.448f, 15f, 11f, 14.552f, 11f, 14f)
            curveTo(11f, 13.448f, 11.448f, 13f, 12f, 13f)
            curveTo(12.552f, 13f, 13f, 13.448f, 13f, 14f)
            close()
            moveTo(12f, 11f)
            curveTo(12.552f, 11f, 13f, 10.552f, 13f, 10f)
            curveTo(13f, 9.448f, 12.552f, 9f, 12f, 9f)
            curveTo(11.448f, 9f, 11f, 9.448f, 11f, 10f)
            curveTo(11f, 10.552f, 11.448f, 11f, 12f, 11f)
            close()
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 20f, 22f, 18.545f, 22f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
            moveTo(3.5f, 7.25f)
            curveTo(3.5f, 6.284f, 4.284f, 5.5f, 5.25f, 5.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 5.5f, 20.5f, 6.284f, 20.5f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(20.5f, 17.716f, 19.716f, 18.5f, 18.75f, 18.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 18.5f, 3.5f, 17.716f, 3.5f, 16.75f)
            verticalLineTo(7.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RatioOneToOnePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.RatioOneToOne, contentDescription = null)
    }
}
