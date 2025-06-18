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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.HardDrive: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HardDrive",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.441f, 4f)
            curveTo(6.578f, 4f, 5.791f, 4.493f, 5.415f, 5.27f)
            lineTo(2.729f, 10.821f)
            curveTo(3.194f, 10.615f, 3.709f, 10.5f, 4.25f, 10.5f)
            horizontalLineTo(19.75f)
            curveTo(20.291f, 10.5f, 20.806f, 10.615f, 21.271f, 10.821f)
            lineTo(18.585f, 5.27f)
            curveTo(18.209f, 4.493f, 17.422f, 4f, 16.559f, 4f)
            horizontalLineTo(7.441f)
            close()
            moveTo(19.75f, 12f)
            curveTo(20.993f, 12f, 22f, 13.007f, 22f, 14.25f)
            verticalLineTo(16.75f)
            curveTo(22f, 17.993f, 20.993f, 19f, 19.75f, 19f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 19f, 2f, 17.993f, 2f, 16.75f)
            verticalLineTo(14.25f)
            curveTo(2f, 13.007f, 3.007f, 12f, 4.25f, 12f)
            horizontalLineTo(19.75f)
            close()
            moveTo(18.5f, 16.5f)
            curveTo(19.052f, 16.5f, 19.5f, 16.052f, 19.5f, 15.5f)
            curveTo(19.5f, 14.948f, 19.052f, 14.5f, 18.5f, 14.5f)
            curveTo(17.948f, 14.5f, 17.5f, 14.948f, 17.5f, 15.5f)
            curveTo(17.5f, 16.052f, 17.948f, 16.5f, 18.5f, 16.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HardDrivePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.HardDrive, contentDescription = null)
    }
}
