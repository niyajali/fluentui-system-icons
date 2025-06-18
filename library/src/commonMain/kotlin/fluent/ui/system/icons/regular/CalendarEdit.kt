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

public val FluentUi.Regular.CalendarEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.749f, 3f)
            curveTo(19.544f, 3f, 20.998f, 4.455f, 20.998f, 6.25f)
            verticalLineTo(11.012f)
            curveTo(20.492f, 10.968f, 19.977f, 11.041f, 19.499f, 11.232f)
            verticalLineTo(8.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(17.749f)
            curveTo(4.5f, 18.715f, 5.283f, 19.499f, 6.25f, 19.499f)
            horizontalLineTo(11.54f)
            curveTo(11.533f, 19.524f, 11.527f, 19.55f, 11.52f, 19.575f)
            lineTo(11.164f, 20.998f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 20.998f, 3f, 19.544f, 3f, 17.749f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.749f)
            close()
            moveTo(17.749f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.283f, 4.5f, 4.5f, 5.283f, 4.5f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(19.499f)
            verticalLineTo(6.25f)
            curveTo(19.499f, 5.283f, 18.715f, 4.5f, 17.749f, 4.5f)
            close()
            moveTo(13.196f, 18.57f)
            lineTo(19.098f, 12.669f)
            curveTo(19.991f, 11.776f, 21.438f, 11.776f, 22.331f, 12.669f)
            curveTo(23.223f, 13.561f, 23.223f, 15.008f, 22.331f, 15.901f)
            lineTo(16.429f, 21.803f)
            curveTo(16.085f, 22.147f, 15.653f, 22.391f, 15.181f, 22.509f)
            lineTo(13.351f, 22.967f)
            curveTo(12.555f, 23.166f, 11.834f, 22.444f, 12.033f, 21.648f)
            lineTo(12.49f, 19.818f)
            curveTo(12.608f, 19.346f, 12.852f, 18.915f, 13.196f, 18.57f)
            close()
            moveTo(9f, 15.75f)
            curveTo(9f, 15.06f, 8.44f, 14.5f, 7.75f, 14.5f)
            curveTo(7.06f, 14.5f, 6.5f, 15.06f, 6.5f, 15.75f)
            curveTo(6.5f, 16.44f, 7.06f, 17f, 7.75f, 17f)
            curveTo(8.44f, 17f, 9f, 16.44f, 9f, 15.75f)
            close()
            moveTo(13.25f, 15.75f)
            curveTo(13.25f, 15.06f, 12.69f, 14.5f, 12f, 14.5f)
            curveTo(11.31f, 14.5f, 10.75f, 15.06f, 10.75f, 15.75f)
            curveTo(10.75f, 16.44f, 11.31f, 17f, 12f, 17f)
            curveTo(12.69f, 17f, 13.25f, 16.44f, 13.25f, 15.75f)
            close()
            moveTo(9f, 11.75f)
            curveTo(9f, 11.06f, 8.44f, 10.5f, 7.75f, 10.5f)
            curveTo(7.06f, 10.5f, 6.5f, 11.06f, 6.5f, 11.75f)
            curveTo(6.5f, 12.44f, 7.06f, 13f, 7.75f, 13f)
            curveTo(8.44f, 13f, 9f, 12.44f, 9f, 11.75f)
            close()
            moveTo(13.25f, 11.75f)
            curveTo(13.25f, 11.06f, 12.69f, 10.5f, 12f, 10.5f)
            curveTo(11.31f, 10.5f, 10.75f, 11.06f, 10.75f, 11.75f)
            curveTo(10.75f, 12.44f, 11.31f, 13f, 12f, 13f)
            curveTo(12.69f, 13f, 13.25f, 12.44f, 13.25f, 11.75f)
            close()
            moveTo(17.5f, 11.75f)
            curveTo(17.5f, 11.06f, 16.94f, 10.5f, 16.25f, 10.5f)
            curveTo(15.56f, 10.5f, 15f, 11.06f, 15f, 11.75f)
            curveTo(15f, 12.44f, 15.56f, 13f, 16.25f, 13f)
            curveTo(16.94f, 13f, 17.5f, 12.44f, 17.5f, 11.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarEdit, contentDescription = null)
    }
}
