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

public val FluentUi.Filled.AppRecent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AppRecent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 19.75f)
            curveTo(18f, 20.941f, 17.075f, 21.916f, 15.904f, 21.995f)
            lineTo(15.75f, 22f)
            horizontalLineTo(8.25f)
            curveTo(7.059f, 22f, 6.084f, 21.075f, 6.005f, 19.904f)
            lineTo(6f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.059f, 6.925f, 2.084f, 8.096f, 2.005f)
            lineTo(8.25f, 2f)
            horizontalLineTo(15.75f)
            curveTo(16.941f, 2f, 17.916f, 2.925f, 17.995f, 4.096f)
            lineTo(18f, 4.25f)
            verticalLineTo(19.75f)
            close()
            moveTo(19f, 5f)
            horizontalLineTo(19.75f)
            curveTo(20.941f, 5f, 21.916f, 5.925f, 21.995f, 7.096f)
            lineTo(22f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(22f, 17.941f, 21.075f, 18.916f, 19.904f, 18.995f)
            lineTo(19.75f, 19f)
            horizontalLineTo(19f)
            verticalLineTo(5f)
            close()
            moveTo(5f, 19f)
            horizontalLineTo(4.25f)
            curveTo(3.059f, 19f, 2.084f, 18.075f, 2.005f, 16.904f)
            lineTo(2f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(2f, 6.059f, 2.925f, 5.084f, 4.096f, 5.005f)
            lineTo(4.25f, 5f)
            horizontalLineTo(5f)
            verticalLineTo(19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AppRecentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.AppRecent, contentDescription = null)
    }
}
