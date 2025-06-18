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

public val FluentUi.Filled.SlideTransition: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideTransition",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 20f, 22f, 18.769f, 22f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(6.5f, 5.5f)
            verticalLineTo(18.5f)
            horizontalLineTo(5f)
            verticalLineTo(5.5f)
            horizontalLineTo(6.5f)
            close()
            moveTo(10.5f, 18.5f)
            horizontalLineTo(9f)
            verticalLineTo(5.5f)
            horizontalLineTo(10.5f)
            verticalLineTo(18.5f)
            close()
            moveTo(15.5f, 18.5f)
            horizontalLineTo(14f)
            verticalLineTo(5.5f)
            horizontalLineTo(15.5f)
            verticalLineTo(18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideTransitionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SlideTransition, contentDescription = null)
    }
}
