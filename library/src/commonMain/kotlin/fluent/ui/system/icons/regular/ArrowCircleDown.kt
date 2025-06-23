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

public val FluentIcons.Regular.ArrowCircleDown: ImageVector
    get() {
        if (_ArrowCircleDown != null) {
            return _ArrowCircleDown!!
        }
        _ArrowCircleDown = ImageVector.Builder(
            name = "Regular.ArrowCircleDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.53f, 11.72f)
                lineTo(16.446f, 11.647f)
                curveTo(16.152f, 11.429f, 15.735f, 11.454f, 15.469f, 11.72f)
                lineTo(12.75f, 14.439f)
                lineTo(12.749f, 7.75f)
                lineTo(12.743f, 7.648f)
                curveTo(12.693f, 7.282f, 12.379f, 7f, 11.999f, 7f)
                lineTo(11.898f, 7.006f)
                curveTo(11.531f, 7.056f, 11.249f, 7.37f, 11.249f, 7.75f)
                lineTo(11.25f, 14.441f)
                lineTo(8.529f, 11.719f)
                lineTo(8.445f, 11.647f)
                curveTo(8.151f, 11.429f, 7.735f, 11.453f, 7.468f, 11.719f)
                curveTo(7.175f, 12.012f, 7.175f, 12.487f, 7.468f, 12.78f)
                lineTo(11.468f, 16.781f)
                lineTo(11.552f, 16.854f)
                curveTo(11.846f, 17.072f, 12.263f, 17.048f, 12.529f, 16.781f)
                lineTo(16.53f, 12.781f)
                lineTo(16.602f, 12.696f)
                curveTo(16.82f, 12.403f, 16.796f, 11.986f, 16.53f, 11.72f)
                close()
                moveTo(1.999f, 12f)
                curveTo(1.999f, 17.523f, 6.476f, 22f, 11.999f, 22f)
                curveTo(17.522f, 22f, 21.999f, 17.523f, 21.999f, 12f)
                curveTo(21.999f, 6.477f, 17.522f, 2f, 11.999f, 2f)
                curveTo(6.476f, 2f, 1.999f, 6.477f, 1.999f, 12f)
                close()
                moveTo(20.499f, 12f)
                curveTo(20.499f, 16.694f, 16.693f, 20.5f, 11.999f, 20.5f)
                curveTo(7.305f, 20.5f, 3.499f, 16.694f, 3.499f, 12f)
                curveTo(3.499f, 7.306f, 7.305f, 3.5f, 11.999f, 3.5f)
                curveTo(16.693f, 3.5f, 20.499f, 7.306f, 20.499f, 12f)
                close()
            }
        }.build()

        return _ArrowCircleDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleDown: ImageVector? = null

@Preview
@Composable
private fun ArrowCircleDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowCircleDown, contentDescription = null)
    }
}
