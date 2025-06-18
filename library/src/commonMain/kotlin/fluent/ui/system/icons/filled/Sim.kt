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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.Sim: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Sim",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 5.25f)
            curveTo(4f, 3.455f, 5.455f, 2f, 7.25f, 2f)
            horizontalLineTo(12.715f)
            curveTo(13.576f, 2f, 14.403f, 2.342f, 15.013f, 2.952f)
            lineTo(19.048f, 6.987f)
            curveTo(19.658f, 7.597f, 20f, 8.424f, 20f, 9.286f)
            verticalLineTo(18.75f)
            curveTo(20f, 20.545f, 18.545f, 22f, 16.75f, 22f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(7.75f, 14f)
            horizontalLineTo(12f)
            verticalLineTo(10.75f)
            horizontalLineTo(9.25f)
            curveTo(8.422f, 10.75f, 7.75f, 11.422f, 7.75f, 12.25f)
            verticalLineTo(14f)
            close()
            moveTo(7.75f, 15.5f)
            verticalLineTo(16.75f)
            curveTo(7.75f, 17.578f, 8.422f, 18.25f, 9.25f, 18.25f)
            horizontalLineTo(12f)
            verticalLineTo(15.5f)
            horizontalLineTo(7.75f)
            close()
            moveTo(13.5f, 18.25f)
            horizontalLineTo(14.75f)
            curveTo(15.578f, 18.25f, 16.25f, 17.578f, 16.25f, 16.75f)
            verticalLineTo(12.25f)
            curveTo(16.25f, 11.422f, 15.578f, 10.75f, 14.75f, 10.75f)
            horizontalLineTo(13.5f)
            verticalLineTo(18.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SimPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Sim, contentDescription = null)
    }
}
