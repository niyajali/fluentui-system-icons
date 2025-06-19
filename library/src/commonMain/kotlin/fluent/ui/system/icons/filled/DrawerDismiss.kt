package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.DrawerDismiss: ImageVector
    get() {
        if (_DrawerDismiss != null) {
            return _DrawerDismiss!!
        }
        _DrawerDismiss = ImageVector.Builder(
            name = "Filled.DrawerDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22f, 6.5f)
                curveTo(22f, 9.538f, 19.538f, 12f, 16.5f, 12f)
                curveTo(13.462f, 12f, 11f, 9.538f, 11f, 6.5f)
                curveTo(11f, 3.462f, 13.462f, 1f, 16.5f, 1f)
                curveTo(19.538f, 1f, 22f, 3.462f, 22f, 6.5f)
                close()
                moveTo(14.854f, 4.146f)
                curveTo(14.658f, 3.951f, 14.342f, 3.951f, 14.146f, 4.146f)
                curveTo(13.951f, 4.342f, 13.951f, 4.658f, 14.146f, 4.854f)
                lineTo(15.793f, 6.5f)
                lineTo(14.146f, 8.146f)
                curveTo(13.951f, 8.342f, 13.951f, 8.658f, 14.146f, 8.854f)
                curveTo(14.342f, 9.049f, 14.658f, 9.049f, 14.854f, 8.854f)
                lineTo(16.5f, 7.207f)
                lineTo(18.146f, 8.854f)
                curveTo(18.342f, 9.049f, 18.658f, 9.049f, 18.854f, 8.854f)
                curveTo(19.049f, 8.658f, 19.049f, 8.342f, 18.854f, 8.146f)
                lineTo(17.207f, 6.5f)
                lineTo(18.854f, 4.854f)
                curveTo(19.049f, 4.658f, 19.049f, 4.342f, 18.854f, 4.146f)
                curveTo(18.658f, 3.951f, 18.342f, 3.951f, 18.146f, 4.146f)
                lineTo(16.5f, 5.793f)
                lineTo(14.854f, 4.146f)
                close()
                moveTo(6.25f, 4f)
                horizontalLineTo(10.498f)
                curveTo(10.3f, 4.474f, 10.157f, 4.977f, 10.076f, 5.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 5.5f, 4.5f, 6.284f, 4.5f, 7.25f)
                verticalLineTo(8f)
                horizontalLineTo(10.174f)
                curveTo(10.299f, 8.528f, 10.488f, 9.031f, 10.732f, 9.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(14f)
                horizontalLineTo(9.058f)
                curveTo(9.44f, 14f, 9.75f, 14.31f, 9.75f, 14.692f)
                verticalLineTo(14.75f)
                curveTo(9.75f, 15.993f, 10.757f, 17f, 12f, 17f)
                curveTo(13.243f, 17f, 14.25f, 15.993f, 14.25f, 14.75f)
                verticalLineTo(14.692f)
                curveTo(14.25f, 14.31f, 14.56f, 14f, 14.942f, 14f)
                horizontalLineTo(19.5f)
                verticalLineTo(12.268f)
                curveTo(20.051f, 11.981f, 20.556f, 11.617f, 21f, 11.19f)
                verticalLineTo(18.75f)
                curveTo(21f, 20.545f, 19.545f, 22f, 17.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 22f, 3f, 20.545f, 3f, 18.75f)
                verticalLineTo(7.25f)
                curveTo(3f, 5.455f, 4.455f, 4f, 6.25f, 4f)
                close()
            }
        }.build()

        return _DrawerDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _DrawerDismiss: ImageVector? = null

@Preview
@Composable
private fun DrawerDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DrawerDismiss, contentDescription = null)
    }
}
