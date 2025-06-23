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

public val FluentIcons.Regular.MoreHorizontal: ImageVector
    get() {
        if (_MoreHorizontal != null) {
            return _MoreHorizontal!!
        }
        _MoreHorizontal = ImageVector.Builder(
            name = "Regular.MoreHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.75f, 12f)
                curveTo(7.75f, 12.967f, 6.966f, 13.75f, 6f, 13.75f)
                curveTo(5.034f, 13.75f, 4.25f, 12.967f, 4.25f, 12f)
                curveTo(4.25f, 11.033f, 5.034f, 10.25f, 6f, 10.25f)
                curveTo(6.966f, 10.25f, 7.75f, 11.033f, 7.75f, 12f)
                close()
                moveTo(13.75f, 12f)
                curveTo(13.75f, 12.967f, 12.967f, 13.75f, 12f, 13.75f)
                curveTo(11.033f, 13.75f, 10.25f, 12.967f, 10.25f, 12f)
                curveTo(10.25f, 11.033f, 11.033f, 10.25f, 12f, 10.25f)
                curveTo(12.967f, 10.25f, 13.75f, 11.033f, 13.75f, 12f)
                close()
                moveTo(18f, 13.75f)
                curveTo(18.966f, 13.75f, 19.75f, 12.967f, 19.75f, 12f)
                curveTo(19.75f, 11.033f, 18.966f, 10.25f, 18f, 10.25f)
                curveTo(17.034f, 10.25f, 16.25f, 11.033f, 16.25f, 12f)
                curveTo(16.25f, 12.967f, 17.034f, 13.75f, 18f, 13.75f)
                close()
            }
        }.build()

        return _MoreHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _MoreHorizontal: ImageVector? = null

@Preview
@Composable
private fun MoreHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MoreHorizontal, contentDescription = null)
    }
}
