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

public val FluentUi.Regular.QuestionCircle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.QuestionCircle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.478f, 22f, 12f)
            curveTo(22f, 17.522f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.522f, 2f, 12f)
            curveTo(2f, 6.478f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(12f, 3.667f)
            curveTo(7.405f, 3.667f, 3.667f, 7.405f, 3.667f, 12f)
            curveTo(3.667f, 16.595f, 7.405f, 20.333f, 12f, 20.333f)
            curveTo(16.595f, 20.333f, 20.333f, 16.595f, 20.333f, 12f)
            curveTo(20.333f, 7.405f, 16.595f, 3.667f, 12f, 3.667f)
            close()
            moveTo(12f, 15.5f)
            curveTo(12.552f, 15.5f, 13f, 15.948f, 13f, 16.5f)
            curveTo(13f, 17.052f, 12.552f, 17.5f, 12f, 17.5f)
            curveTo(11.448f, 17.5f, 11f, 17.052f, 11f, 16.5f)
            curveTo(11f, 15.948f, 11.448f, 15.5f, 12f, 15.5f)
            close()
            moveTo(12f, 6.75f)
            curveTo(13.519f, 6.75f, 14.75f, 7.981f, 14.75f, 9.5f)
            curveTo(14.75f, 10.511f, 14.453f, 11.074f, 13.699f, 11.859f)
            lineTo(13.53f, 12.03f)
            curveTo(12.908f, 12.652f, 12.75f, 12.916f, 12.75f, 13.5f)
            curveTo(12.75f, 13.914f, 12.414f, 14.25f, 12f, 14.25f)
            curveTo(11.586f, 14.25f, 11.25f, 13.914f, 11.25f, 13.5f)
            curveTo(11.25f, 12.489f, 11.547f, 11.926f, 12.301f, 11.141f)
            lineTo(12.47f, 10.97f)
            curveTo(13.092f, 10.348f, 13.25f, 10.084f, 13.25f, 9.5f)
            curveTo(13.25f, 8.81f, 12.69f, 8.25f, 12f, 8.25f)
            curveTo(11.353f, 8.25f, 10.821f, 8.742f, 10.757f, 9.372f)
            lineTo(10.75f, 9.5f)
            curveTo(10.75f, 9.914f, 10.414f, 10.25f, 10f, 10.25f)
            curveTo(9.586f, 10.25f, 9.25f, 9.914f, 9.25f, 9.5f)
            curveTo(9.25f, 7.981f, 10.481f, 6.75f, 12f, 6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun QuestionCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.QuestionCircle, contentDescription = null)
    }
}
