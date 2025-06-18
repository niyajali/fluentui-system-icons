package fluent.ui.system.icons.light

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

public val FluentUi.Light.Eye: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Eye",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.998f, 24f)
            curveTo(12.688f, 24f, 9.998f, 21.31f, 9.998f, 18f)
            curveTo(9.998f, 14.69f, 12.688f, 12f, 15.998f, 12f)
            curveTo(19.308f, 12f, 21.998f, 14.69f, 21.998f, 18f)
            curveTo(21.998f, 21.31f, 19.308f, 24f, 15.998f, 24f)
            close()
            moveTo(15.998f, 13f)
            curveTo(13.238f, 13f, 10.998f, 15.24f, 10.998f, 18f)
            curveTo(10.998f, 20.76f, 13.238f, 23f, 15.998f, 23f)
            curveTo(18.758f, 23f, 20.998f, 20.76f, 20.998f, 18f)
            curveTo(20.998f, 15.24f, 18.758f, 13f, 15.998f, 13f)
            close()
            moveTo(29.498f, 18f)
            curveTo(29.268f, 18f, 29.068f, 17.84f, 29.008f, 17.61f)
            curveTo(28.908f, 17.18f, 26.458f, 7f, 15.998f, 7f)
            curveTo(5.538f, 7f, 3.088f, 17.18f, 2.988f, 17.61f)
            curveTo(2.928f, 17.88f, 2.658f, 18.05f, 2.388f, 17.99f)
            curveTo(2.118f, 17.93f, 1.948f, 17.66f, 2.008f, 17.39f)
            curveTo(2.038f, 17.28f, 4.728f, 6f, 15.998f, 6f)
            curveTo(27.268f, 6f, 29.958f, 17.27f, 29.988f, 17.39f)
            curveTo(30.048f, 17.66f, 29.878f, 17.93f, 29.608f, 17.99f)
            curveTo(29.568f, 17.99f, 29.528f, 18f, 29.498f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EyePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Eye, contentDescription = null)
    }
}
