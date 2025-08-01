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

public val FluentIcons.Filled.CheckmarkCircle: ImageVector
    get() {
        if (_CheckmarkCircle != null) {
            return _CheckmarkCircle!!
        }
        _CheckmarkCircle = ImageVector.Builder(
            name = "Filled.CheckmarkCircle",
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
                moveTo(15.22f, 8.97f)
                lineTo(10.75f, 13.439f)
                lineTo(8.78f, 11.47f)
                curveTo(8.487f, 11.177f, 8.013f, 11.177f, 7.72f, 11.47f)
                curveTo(7.427f, 11.763f, 7.427f, 12.237f, 7.72f, 12.53f)
                lineTo(10.22f, 15.03f)
                curveTo(10.513f, 15.323f, 10.987f, 15.323f, 11.28f, 15.03f)
                lineTo(16.28f, 10.03f)
                curveTo(16.573f, 9.737f, 16.573f, 9.263f, 16.28f, 8.97f)
                curveTo(15.987f, 8.677f, 15.513f, 8.677f, 15.22f, 8.97f)
                close()
            }
        }.build()

        return _CheckmarkCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CheckmarkCircle: ImageVector? = null

@Preview
@Composable
private fun CheckmarkCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CheckmarkCircle, contentDescription = null)
    }
}
