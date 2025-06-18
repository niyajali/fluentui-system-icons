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

public val FluentIcons.Filled.Briefcase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Briefcase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
            verticalLineTo(6f)
            horizontalLineTo(9.5f)
            verticalLineTo(4.25f)
            curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
            close()
            moveTo(8f, 4.25f)
            verticalLineTo(6f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 6f, 3f, 7.455f, 3f, 9.25f)
            verticalLineTo(10.75f)
            curveTo(3f, 11.717f, 3.783f, 12.5f, 4.75f, 12.5f)
            horizontalLineTo(10f)
            verticalLineTo(12f)
            curveTo(10f, 11.448f, 10.448f, 11f, 11f, 11f)
            horizontalLineTo(13f)
            curveTo(13.552f, 11f, 14f, 11.448f, 14f, 12f)
            verticalLineTo(12.5f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 12.5f, 21f, 11.717f, 21f, 10.75f)
            verticalLineTo(9.25f)
            curveTo(21f, 7.455f, 19.545f, 6f, 17.75f, 6f)
            horizontalLineTo(16f)
            verticalLineTo(4.25f)
            curveTo(16f, 3.007f, 14.993f, 2f, 13.75f, 2f)
            horizontalLineTo(10.25f)
            curveTo(9.007f, 2f, 8f, 3.007f, 8f, 4.25f)
            close()
            moveTo(21f, 13.489f)
            curveTo(20.495f, 13.813f, 19.894f, 14f, 19.25f, 14f)
            horizontalLineTo(14f)
            curveTo(14f, 14.552f, 13.552f, 15f, 13f, 15f)
            horizontalLineTo(11f)
            curveTo(10.448f, 15f, 10f, 14.552f, 10f, 14f)
            horizontalLineTo(4.75f)
            curveTo(4.106f, 14f, 3.505f, 13.813f, 3f, 13.489f)
            verticalLineTo(16.75f)
            curveTo(3f, 18.545f, 4.455f, 20f, 6.25f, 20f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 20f, 21f, 18.545f, 21f, 16.75f)
            verticalLineTo(13.489f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Briefcase, contentDescription = null)
    }
}
