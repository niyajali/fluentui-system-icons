/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.FolderPeople: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FolderPeople",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(8.129f)
            curveTo(8.328f, 8f, 8.518f, 7.921f, 8.659f, 7.78f)
            lineTo(10.189f, 6.25f)
            lineTo(8.659f, 4.72f)
            curveTo(8.518f, 4.579f, 8.328f, 4.5f, 8.129f, 4.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
            close()
            moveTo(2f, 6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineTo(8.129f)
            curveTo(8.725f, 3f, 9.298f, 3.237f, 9.72f, 3.659f)
            lineTo(11.561f, 5.5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5.5f, 22f, 6.955f, 22f, 8.75f)
            verticalLineTo(13.5f)
            curveTo(21.582f, 13.186f, 21.063f, 13f, 20.5f, 13f)
            verticalLineTo(8.75f)
            curveTo(20.5f, 7.784f, 19.716f, 7f, 18.75f, 7f)
            horizontalLineTo(11.561f)
            lineTo(9.72f, 8.841f)
            curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(17.75f)
            curveTo(3.5f, 18.716f, 4.284f, 19.5f, 5.25f, 19.5f)
            horizontalLineTo(11.042f)
            curveTo(11.014f, 19.663f, 11f, 19.83f, 11f, 20f)
            curveTo(11f, 20.328f, 11.036f, 20.666f, 11.116f, 21f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(15.5f, 17f)
            curveTo(16.605f, 17f, 17.5f, 16.105f, 17.5f, 15f)
            curveTo(17.5f, 13.895f, 16.605f, 13f, 15.5f, 13f)
            curveTo(14.395f, 13f, 13.5f, 13.895f, 13.5f, 15f)
            curveTo(13.5f, 16.105f, 14.395f, 17f, 15.5f, 17f)
            close()
            moveTo(15.5f, 23f)
            curveTo(18.067f, 23f, 19f, 21.479f, 19f, 20f)
            curveTo(19f, 18.895f, 18.105f, 18f, 17f, 18f)
            horizontalLineTo(14f)
            curveTo(12.895f, 18f, 12f, 18.895f, 12f, 20f)
            curveTo(12f, 21.479f, 12.933f, 23f, 15.5f, 23f)
            close()
            moveTo(19.507f, 21.978f)
            curveTo(19.663f, 21.993f, 19.827f, 22f, 20f, 22f)
            curveTo(22.2f, 22f, 23f, 20.784f, 23f, 19.6f)
            curveTo(23f, 18.716f, 22.284f, 18f, 21.4f, 18f)
            horizontalLineTo(19.236f)
            curveTo(19.711f, 18.531f, 20f, 19.232f, 20f, 20f)
            curveTo(20f, 20.656f, 19.856f, 21.35f, 19.507f, 21.978f)
            close()
            moveTo(22f, 15.5f)
            curveTo(22f, 16.328f, 21.328f, 17f, 20.5f, 17f)
            curveTo(19.672f, 17f, 19f, 16.328f, 19f, 15.5f)
            curveTo(19f, 14.672f, 19.672f, 14f, 20.5f, 14f)
            curveTo(21.328f, 14f, 22f, 14.672f, 22f, 15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FolderPeoplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FolderPeople, contentDescription = null)
    }
}
