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

public val FluentUi.Filled.DataArea: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataArea",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 3f)
            curveTo(4.552f, 3f, 5f, 3.448f, 5f, 4f)
            verticalLineTo(17.5f)
            curveTo(5f, 18.328f, 5.672f, 19f, 6.5f, 19f)
            horizontalLineTo(20f)
            curveTo(20.552f, 19f, 21f, 19.448f, 21f, 20f)
            curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 21f, 3f, 19.433f, 3f, 17.5f)
            verticalLineTo(4f)
            curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
            close()
            moveTo(19.5f, 6.75f)
            lineTo(19.5f, 18f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 18f, 6f, 17.776f, 6f, 17.5f)
            verticalLineTo(9.161f)
            lineTo(8.165f, 8.079f)
            curveTo(8.392f, 7.966f, 8.661f, 7.975f, 8.88f, 8.104f)
            lineTo(12.7f, 10.35f)
            lineTo(18.3f, 6.15f)
            curveTo(18.527f, 5.98f, 18.831f, 5.952f, 19.085f, 6.079f)
            curveTo(19.34f, 6.206f, 19.5f, 6.466f, 19.5f, 6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataAreaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DataArea, contentDescription = null)
    }
}
