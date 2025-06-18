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

public val FluentUi.Filled.ArrowDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.716f, 13.705f)
            curveTo(20.104f, 13.311f, 20.099f, 12.678f, 19.706f, 12.29f)
            curveTo(19.312f, 11.903f, 18.679f, 11.907f, 18.292f, 12.301f)
            lineTo(13f, 17.671f)
            verticalLineTo(4f)
            curveTo(13f, 3.448f, 12.552f, 3f, 12f, 3f)
            curveTo(11.448f, 3f, 11f, 3.448f, 11f, 4f)
            verticalLineTo(17.665f)
            lineTo(5.715f, 12.301f)
            curveTo(5.328f, 11.907f, 4.694f, 11.903f, 4.301f, 12.29f)
            curveTo(3.908f, 12.678f, 3.903f, 13.311f, 4.291f, 13.705f)
            lineTo(11.113f, 20.629f)
            curveTo(11.603f, 21.126f, 12.404f, 21.126f, 12.894f, 20.629f)
            lineTo(19.716f, 13.705f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowDown, contentDescription = null)
    }
}
