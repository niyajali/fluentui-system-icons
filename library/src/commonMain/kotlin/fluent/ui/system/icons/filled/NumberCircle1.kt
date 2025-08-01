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

public val FluentIcons.Filled.NumberCircle1: ImageVector
    get() {
        if (_NumberCircle1 != null) {
            return _NumberCircle1!!
        }
        _NumberCircle1 = ImageVector.Builder(
            name = "Filled.NumberCircle1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(13.5f, 7.25f)
                verticalLineTo(16.25f)
                curveTo(13.5f, 16.664f, 13.164f, 17f, 12.75f, 17f)
                curveTo(12.336f, 17f, 12f, 16.664f, 12f, 16.25f)
                verticalLineTo(10.1f)
                curveTo(11.452f, 10.688f, 10.766f, 11.202f, 9.987f, 11.462f)
                curveTo(9.594f, 11.592f, 9.17f, 11.38f, 9.039f, 10.987f)
                curveTo(8.908f, 10.594f, 9.12f, 10.17f, 9.513f, 10.038f)
                curveTo(10.085f, 9.848f, 10.662f, 9.395f, 11.136f, 8.809f)
                curveTo(11.611f, 8.223f, 11.919f, 7.581f, 12.015f, 7.103f)
                curveTo(12.09f, 6.725f, 12.44f, 6.466f, 12.824f, 6.504f)
                curveTo(13.208f, 6.542f, 13.5f, 6.864f, 13.5f, 7.25f)
                close()
            }
        }.build()

        return _NumberCircle1!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircle1: ImageVector? = null

@Preview
@Composable
private fun NumberCircle1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NumberCircle1, contentDescription = null)
    }
}
