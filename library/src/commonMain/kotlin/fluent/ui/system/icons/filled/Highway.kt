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

public val FluentIcons.Filled.Highway: ImageVector
    get() {
        if (_Highway != null) {
            return _Highway!!
        }
        _Highway = ImageVector.Builder(
            name = "Filled.Highway",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.987f, 3.164f)
                curveTo(8.077f, 2.62f, 7.709f, 2.104f, 7.165f, 2.014f)
                curveTo(6.62f, 1.923f, 6.105f, 2.291f, 6.014f, 2.836f)
                lineTo(3.014f, 20.836f)
                curveTo(2.923f, 21.38f, 3.291f, 21.896f, 3.836f, 21.986f)
                curveTo(4.381f, 22.077f, 4.896f, 21.709f, 4.987f, 21.164f)
                lineTo(7.987f, 3.164f)
                close()
                moveTo(17.987f, 2.836f)
                curveTo(17.896f, 2.291f, 17.381f, 1.923f, 16.836f, 2.014f)
                curveTo(16.291f, 2.104f, 15.923f, 2.62f, 16.014f, 3.164f)
                lineTo(19.014f, 21.164f)
                curveTo(19.105f, 21.709f, 19.62f, 22.077f, 20.165f, 21.986f)
                curveTo(20.709f, 21.896f, 21.077f, 21.38f, 20.986f, 20.836f)
                lineTo(17.987f, 2.836f)
                close()
                moveTo(13f, 3f)
                curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
                curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
                verticalLineTo(6f)
                curveTo(11f, 6.552f, 11.448f, 7f, 12f, 7f)
                curveTo(12.552f, 7f, 13f, 6.552f, 13f, 6f)
                verticalLineTo(3f)
                close()
                moveTo(11f, 13.5f)
                curveTo(11f, 14.052f, 11.448f, 14.5f, 12f, 14.5f)
                curveTo(12.552f, 14.5f, 13f, 14.052f, 13f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(13f, 9.948f, 12.552f, 9.5f, 12f, 9.5f)
                curveTo(11.448f, 9.5f, 11f, 9.948f, 11f, 10.5f)
                verticalLineTo(13.5f)
                close()
                moveTo(11f, 18f)
                curveTo(11f, 17.448f, 11.448f, 17f, 12f, 17f)
                curveTo(12.552f, 17f, 13f, 17.448f, 13f, 18f)
                verticalLineTo(21f)
                curveTo(13f, 21.552f, 12.552f, 22f, 12f, 22f)
                curveTo(11.448f, 22f, 11f, 21.552f, 11f, 21f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _Highway!!
    }

@Suppress("ObjectPropertyName")
private var _Highway: ImageVector? = null

@Preview
@Composable
private fun HighwayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Highway, contentDescription = null)
    }
}
