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

public val FluentUi.Filled.Tv: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tv",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineTo(15.25f)
            curveTo(2f, 16.769f, 3.231f, 18f, 4.75f, 18f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 18f, 22f, 16.769f, 22f, 15.25f)
            verticalLineTo(6.75f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(5f, 20.25f)
            curveTo(5f, 19.836f, 5.336f, 19.5f, 5.75f, 19.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 19.5f, 19f, 19.836f, 19f, 20.25f)
            curveTo(19f, 20.664f, 18.664f, 21f, 18.25f, 21f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 21f, 5f, 20.664f, 5f, 20.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TvPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Tv, contentDescription = null)
    }
}
