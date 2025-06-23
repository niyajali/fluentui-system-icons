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

public val FluentIcons.Filled.HomeSplit: ImageVector
    get() {
        if (_HomeSplit != null) {
            return _HomeSplit!!
        }
        _HomeSplit = ImageVector.Builder(
            name = "Filled.HomeSplit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.451f, 2.533f)
                curveTo(12.613f, 1.826f, 11.387f, 1.826f, 10.549f, 2.533f)
                lineTo(3.799f, 8.228f)
                curveTo(3.292f, 8.655f, 3f, 9.284f, 3f, 9.947f)
                verticalLineTo(19.253f)
                curveTo(3f, 20.219f, 3.783f, 21.003f, 4.75f, 21.003f)
                horizontalLineTo(19.25f)
                curveTo(20.216f, 21.003f, 21f, 20.219f, 21f, 19.253f)
                verticalLineTo(9.947f)
                curveTo(21f, 9.284f, 20.708f, 8.655f, 20.201f, 8.228f)
                lineTo(13.451f, 2.533f)
                close()
                moveTo(12.75f, 6.25f)
                verticalLineTo(7.75f)
                curveTo(12.75f, 8.164f, 12.414f, 8.5f, 12f, 8.5f)
                curveTo(11.586f, 8.5f, 11.25f, 8.164f, 11.25f, 7.75f)
                verticalLineTo(6.25f)
                curveTo(11.25f, 5.836f, 11.586f, 5.5f, 12f, 5.5f)
                curveTo(12.414f, 5.5f, 12.75f, 5.836f, 12.75f, 6.25f)
                close()
                moveTo(12f, 10.5f)
                curveTo(12.414f, 10.5f, 12.75f, 10.836f, 12.75f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(12.75f, 13.164f, 12.414f, 13.5f, 12f, 13.5f)
                curveTo(11.586f, 13.5f, 11.25f, 13.164f, 11.25f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(11.25f, 10.836f, 11.586f, 10.5f, 12f, 10.5f)
                close()
                moveTo(12.75f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(12.75f, 18.164f, 12.414f, 18.5f, 12f, 18.5f)
                curveTo(11.586f, 18.5f, 11.25f, 18.164f, 11.25f, 17.75f)
                verticalLineTo(16.25f)
                curveTo(11.25f, 15.836f, 11.586f, 15.5f, 12f, 15.5f)
                curveTo(12.414f, 15.5f, 12.75f, 15.836f, 12.75f, 16.25f)
                close()
            }
        }.build()

        return _HomeSplit!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSplit: ImageVector? = null

@Preview
@Composable
private fun HomeSplitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HomeSplit, contentDescription = null)
    }
}
