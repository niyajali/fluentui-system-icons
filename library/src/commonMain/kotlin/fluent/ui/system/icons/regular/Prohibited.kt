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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.Prohibited: ImageVector
    get() {
        if (_Prohibited != null) {
            return _Prohibited!!
        }
        _Prohibited = ImageVector.Builder(
            name = "Regular.Prohibited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                close()
                moveTo(18.517f, 6.543f)
                lineTo(6.543f, 18.517f)
                curveTo(8.02f, 19.755f, 9.923f, 20.5f, 12f, 20.5f)
                curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
                curveTo(20.5f, 9.923f, 19.755f, 8.02f, 18.517f, 6.543f)
                close()
                moveTo(12f, 3.5f)
                curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
                curveTo(3.5f, 14.077f, 4.245f, 15.98f, 5.483f, 17.457f)
                lineTo(17.457f, 5.483f)
                curveTo(15.98f, 4.245f, 14.077f, 3.5f, 12f, 3.5f)
                close()
            }
        }.build()

        return _Prohibited!!
    }

@Suppress("ObjectPropertyName")
private var _Prohibited: ImageVector? = null

@Preview
@Composable
private fun ProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Prohibited, contentDescription = null)
    }
}
