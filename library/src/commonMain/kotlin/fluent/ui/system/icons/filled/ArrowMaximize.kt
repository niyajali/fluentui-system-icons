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

public val FluentUi.Filled.ArrowMaximize: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowMaximize",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.5f, 3.5f)
            curveTo(20.052f, 3.5f, 20.5f, 3.948f, 20.5f, 4.5f)
            verticalLineTo(12f)
            curveTo(20.5f, 12.552f, 20.052f, 13f, 19.5f, 13f)
            curveTo(18.948f, 13f, 18.5f, 12.552f, 18.5f, 12f)
            verticalLineTo(6.914f)
            lineTo(6.914f, 18.5f)
            horizontalLineTo(12f)
            curveTo(12.552f, 18.5f, 13f, 18.948f, 13f, 19.5f)
            curveTo(13f, 20.052f, 12.552f, 20.5f, 12f, 20.5f)
            horizontalLineTo(4.5f)
            curveTo(3.948f, 20.5f, 3.5f, 20.052f, 3.5f, 19.5f)
            verticalLineTo(12f)
            curveTo(3.5f, 11.448f, 3.948f, 11f, 4.5f, 11f)
            curveTo(5.052f, 11f, 5.5f, 11.448f, 5.5f, 12f)
            verticalLineTo(17.086f)
            lineTo(17.086f, 5.5f)
            horizontalLineTo(12f)
            curveTo(11.448f, 5.5f, 11f, 5.052f, 11f, 4.5f)
            curveTo(11f, 3.948f, 11.448f, 3.5f, 12f, 3.5f)
            horizontalLineTo(19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowMaximizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowMaximize, contentDescription = null)
    }
}
