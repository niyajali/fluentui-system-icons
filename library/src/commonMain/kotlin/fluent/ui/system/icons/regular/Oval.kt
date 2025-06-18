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

public val FluentUi.Regular.Oval: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Oval",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 12f)
            curveTo(2f, 7.582f, 5.582f, 4f, 10f, 4f)
            horizontalLineTo(14f)
            curveTo(18.418f, 4f, 22f, 7.582f, 22f, 12f)
            curveTo(22f, 16.418f, 18.418f, 20f, 14f, 20f)
            horizontalLineTo(10f)
            curveTo(5.582f, 20f, 2f, 16.418f, 2f, 12f)
            close()
            moveTo(10f, 5.5f)
            curveTo(6.41f, 5.5f, 3.5f, 8.41f, 3.5f, 12f)
            curveTo(3.5f, 15.59f, 6.41f, 18.5f, 10f, 18.5f)
            horizontalLineTo(14f)
            curveTo(17.59f, 18.5f, 20.5f, 15.59f, 20.5f, 12f)
            curveTo(20.5f, 8.41f, 17.59f, 5.5f, 14f, 5.5f)
            horizontalLineTo(10f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OvalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Oval, contentDescription = null)
    }
}
