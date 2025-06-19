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

public val FluentIcons.Filled.FlagPridePhiladelphia: ImageVector
    get() {
        if (_FlagPridePhiladelphia != null) {
            return _FlagPridePhiladelphia!!
        }
        _FlagPridePhiladelphia = ImageVector.Builder(
            name = "Filled.FlagPridePhiladelphia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF745125))) {
                moveTo(4f, 4.25f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE62C46))) {
                moveTo(4f, 5.75f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF36D38))) {
                moveTo(4f, 7.25f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD23E))) {
                moveTo(4f, 9f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF61BC51))) {
                moveTo(4f, 10.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1793E8))) {
                moveTo(4f, 12.25f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB73FBB))) {
                moveTo(4f, 13.75f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 3f)
                curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
                verticalLineTo(21.25f)
                curveTo(3f, 21.664f, 3.336f, 22f, 3.75f, 22f)
                curveTo(4.164f, 22f, 4.5f, 21.664f, 4.5f, 21.25f)
                lineTo(4.5f, 16.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 16.5f, 21f, 16.164f, 21f, 15.75f)
                verticalLineTo(3.75f)
                curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
                horizontalLineTo(3.75f)
                close()
                moveTo(4.5f, 4.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(15f)
                horizontalLineTo(4.5f)
                verticalLineTo(4.5f)
                close()
            }
        }.build()

        return _FlagPridePhiladelphia!!
    }

@Suppress("ObjectPropertyName")
private var _FlagPridePhiladelphia: ImageVector? = null

@Preview
@Composable
private fun FlagPridePhiladelphiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FlagPridePhiladelphia, contentDescription = null)
    }
}
