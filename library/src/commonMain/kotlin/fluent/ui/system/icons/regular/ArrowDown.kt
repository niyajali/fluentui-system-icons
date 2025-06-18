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

public val FluentUi.Regular.ArrowDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.791f, 13.267f)
            curveTo(20.076f, 12.967f, 20.065f, 12.493f, 19.765f, 12.207f)
            curveTo(19.465f, 11.921f, 18.99f, 11.933f, 18.704f, 12.233f)
            lineTo(12.75f, 18.484f)
            verticalLineTo(3.75f)
            curveTo(12.75f, 3.336f, 12.414f, 3f, 12f, 3f)
            curveTo(11.586f, 3f, 11.25f, 3.336f, 11.25f, 3.75f)
            verticalLineTo(18.484f)
            lineTo(5.295f, 12.233f)
            curveTo(5.009f, 11.933f, 4.535f, 11.921f, 4.235f, 12.207f)
            curveTo(3.935f, 12.493f, 3.923f, 12.967f, 4.209f, 13.267f)
            lineTo(11.276f, 20.686f)
            curveTo(11.437f, 20.855f, 11.642f, 20.955f, 11.856f, 20.986f)
            curveTo(11.902f, 20.995f, 11.95f, 21f, 12f, 21f)
            curveTo(12.05f, 21f, 12.098f, 20.995f, 12.145f, 20.986f)
            curveTo(12.358f, 20.955f, 12.563f, 20.855f, 12.724f, 20.686f)
            lineTo(19.791f, 13.267f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowDown, contentDescription = null)
    }
}
