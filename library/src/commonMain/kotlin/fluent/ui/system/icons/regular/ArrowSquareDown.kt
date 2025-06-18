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

public val FluentUi.Regular.ArrowSquareDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSquareDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.53f, 11.72f)
            lineTo(16.446f, 11.648f)
            curveTo(16.153f, 11.43f, 15.736f, 11.454f, 15.47f, 11.72f)
            lineTo(12.75f, 14.44f)
            lineTo(12.75f, 7.75f)
            lineTo(12.743f, 7.648f)
            curveTo(12.693f, 7.282f, 12.38f, 7f, 12f, 7f)
            lineTo(11.898f, 7.007f)
            curveTo(11.532f, 7.057f, 11.25f, 7.37f, 11.25f, 7.75f)
            lineTo(11.25f, 14.442f)
            lineTo(8.53f, 11.72f)
            lineTo(8.446f, 11.647f)
            curveTo(8.152f, 11.429f, 7.735f, 11.453f, 7.469f, 11.72f)
            curveTo(7.176f, 12.012f, 7.176f, 12.487f, 7.469f, 12.78f)
            lineTo(11.469f, 16.782f)
            lineTo(11.553f, 16.854f)
            curveTo(11.847f, 17.072f, 12.263f, 17.048f, 12.53f, 16.782f)
            lineTo(16.53f, 12.781f)
            lineTo(16.603f, 12.697f)
            curveTo(16.821f, 12.403f, 16.797f, 11.987f, 16.53f, 11.72f)
            close()
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSquareDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowSquareDown, contentDescription = null)
    }
}
