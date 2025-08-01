/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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

public val FluentIcons.Regular.HomeMore: ImageVector
    get() {
        if (_HomeMore != null) {
            return _HomeMore!!
        }
        _HomeMore = ImageVector.Builder(
            name = "Regular.HomeMore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.75f, 10.5f)
                curveTo(8.44f, 10.5f, 9f, 11.059f, 9f, 11.75f)
                curveTo(9f, 12.44f, 8.44f, 13f, 7.75f, 13f)
                curveTo(7.06f, 13f, 6.5f, 12.44f, 6.5f, 11.75f)
                curveTo(6.5f, 11.059f, 7.06f, 10.5f, 7.75f, 10.5f)
                close()
                moveTo(12f, 10.5f)
                curveTo(12.69f, 10.5f, 13.25f, 11.059f, 13.25f, 11.75f)
                curveTo(13.25f, 12.44f, 12.69f, 13f, 12f, 13f)
                curveTo(11.31f, 13f, 10.75f, 12.44f, 10.75f, 11.75f)
                curveTo(10.75f, 11.059f, 11.31f, 10.5f, 12f, 10.5f)
                close()
                moveTo(17.5f, 11.75f)
                curveTo(17.5f, 11.059f, 16.94f, 10.5f, 16.25f, 10.5f)
                curveTo(15.56f, 10.5f, 15f, 11.059f, 15f, 11.75f)
                curveTo(15f, 12.44f, 15.56f, 13f, 16.25f, 13f)
                curveTo(16.94f, 13f, 17.5f, 12.44f, 17.5f, 11.75f)
                close()
                moveTo(9f, 15.75f)
                curveTo(9f, 15.059f, 8.44f, 14.5f, 7.75f, 14.5f)
                curveTo(7.06f, 14.5f, 6.5f, 15.059f, 6.5f, 15.75f)
                curveTo(6.5f, 16.44f, 7.06f, 17f, 7.75f, 17f)
                curveTo(8.44f, 17f, 9f, 16.44f, 9f, 15.75f)
                close()
                moveTo(13.25f, 15.75f)
                curveTo(13.25f, 15.059f, 12.69f, 14.5f, 12f, 14.5f)
                curveTo(11.31f, 14.5f, 10.75f, 15.059f, 10.75f, 15.75f)
                curveTo(10.75f, 16.44f, 11.31f, 17f, 12f, 17f)
                curveTo(12.69f, 17f, 13.25f, 16.44f, 13.25f, 15.75f)
                close()
                moveTo(16.25f, 14.5f)
                curveTo(16.94f, 14.5f, 17.5f, 15.059f, 17.5f, 15.75f)
                curveTo(17.5f, 16.44f, 16.94f, 17f, 16.25f, 17f)
                curveTo(15.56f, 17f, 15f, 16.44f, 15f, 15.75f)
                curveTo(15f, 15.059f, 15.56f, 14.5f, 16.25f, 14.5f)
                close()
                moveTo(10.537f, 2.534f)
                curveTo(11.375f, 1.825f, 12.601f, 1.825f, 13.44f, 2.532f)
                lineTo(20.2f, 8.231f)
                curveTo(20.707f, 8.658f, 21f, 9.288f, 21f, 9.951f)
                verticalLineTo(19.25f)
                curveTo(21f, 20.216f, 20.216f, 21f, 19.25f, 21f)
                horizontalLineTo(4.75f)
                curveTo(3.783f, 21f, 3f, 20.216f, 3f, 19.25f)
                verticalLineTo(9.95f)
                curveTo(3f, 9.288f, 3.292f, 8.659f, 3.797f, 8.232f)
                lineTo(10.537f, 2.534f)
                close()
                moveTo(12.473f, 3.679f)
                curveTo(12.193f, 3.443f, 11.785f, 3.443f, 11.505f, 3.679f)
                lineTo(4.766f, 9.377f)
                curveTo(4.597f, 9.52f, 4.5f, 9.729f, 4.5f, 9.95f)
                verticalLineTo(19.25f)
                curveTo(4.5f, 19.388f, 4.612f, 19.5f, 4.75f, 19.5f)
                horizontalLineTo(19.25f)
                curveTo(19.388f, 19.5f, 19.5f, 19.388f, 19.5f, 19.25f)
                verticalLineTo(9.951f)
                curveTo(19.5f, 9.73f, 19.402f, 9.52f, 19.233f, 9.378f)
                lineTo(12.473f, 3.679f)
                close()
            }
        }.build()

        return _HomeMore!!
    }

@Suppress("ObjectPropertyName")
private var _HomeMore: ImageVector? = null

@Preview
@Composable
private fun HomeMorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HomeMore, contentDescription = null)
    }
}
