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

public val FluentIcons.Filled.BriefcasePerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BriefcasePerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 6f)
            verticalLineTo(4.25f)
            curveTo(8f, 3.007f, 9.007f, 2f, 10.25f, 2f)
            horizontalLineTo(13.75f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineTo(6f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 6f, 21f, 7.455f, 21f, 9.25f)
            verticalLineTo(10.75f)
            curveTo(21f, 11.378f, 20.669f, 11.93f, 20.171f, 12.238f)
            curveTo(19.529f, 11.481f, 18.571f, 11f, 17.5f, 11f)
            curveTo(16.311f, 11f, 15.26f, 11.593f, 14.627f, 12.5f)
            horizontalLineTo(14f)
            verticalLineTo(12f)
            curveTo(14f, 11.448f, 13.552f, 11f, 13f, 11f)
            horizontalLineTo(11f)
            curveTo(10.448f, 11f, 10f, 11.448f, 10f, 12f)
            verticalLineTo(12.5f)
            horizontalLineTo(4.75f)
            curveTo(3.783f, 12.5f, 3f, 11.717f, 3f, 10.75f)
            verticalLineTo(9.25f)
            curveTo(3f, 7.455f, 4.455f, 6f, 6.25f, 6f)
            horizontalLineTo(8f)
            close()
            moveTo(13.75f, 3.5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 3.5f, 9.5f, 3.836f, 9.5f, 4.25f)
            verticalLineTo(6f)
            horizontalLineTo(14.5f)
            verticalLineTo(4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            close()
            moveTo(14.035f, 14f)
            horizontalLineTo(14f)
            curveTo(14f, 14.552f, 13.552f, 15f, 13f, 15f)
            horizontalLineTo(11f)
            curveTo(10.448f, 15f, 10f, 14.552f, 10f, 14f)
            horizontalLineTo(4.75f)
            curveTo(4.106f, 14f, 3.505f, 13.813f, 3f, 13.489f)
            verticalLineTo(16.75f)
            curveTo(3f, 18.545f, 4.455f, 20f, 6.25f, 20f)
            horizontalLineTo(12.002f)
            curveTo(12.001f, 19.958f, 12f, 19.917f, 12f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(12f, 18.24f, 13.242f, 17f, 14.773f, 17f)
            horizontalLineTo(15.05f)
            curveTo(14.402f, 16.365f, 14f, 15.479f, 14f, 14.5f)
            curveTo(14f, 14.33f, 14.012f, 14.163f, 14.035f, 14f)
            close()
            moveTo(20f, 14.5f)
            curveTo(20f, 15.881f, 18.881f, 17f, 17.5f, 17f)
            curveTo(16.119f, 17f, 15f, 15.881f, 15f, 14.5f)
            curveTo(15f, 13.119f, 16.119f, 12f, 17.5f, 12f)
            curveTo(18.881f, 12f, 20f, 13.119f, 20f, 14.5f)
            close()
            moveTo(22f, 19.875f)
            curveTo(22f, 21.431f, 20.714f, 23f, 17.5f, 23f)
            curveTo(14.286f, 23f, 13f, 21.437f, 13f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(13f, 18.793f, 13.794f, 18f, 14.773f, 18f)
            horizontalLineTo(20.227f)
            curveTo(21.206f, 18f, 22f, 18.793f, 22f, 19.772f)
            verticalLineTo(19.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BriefcasePersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BriefcasePerson, contentDescription = null)
    }
}
